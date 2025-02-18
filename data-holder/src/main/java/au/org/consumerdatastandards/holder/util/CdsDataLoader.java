package au.org.consumerdatastandards.holder.util;

import au.org.consumerdatastandards.holder.model.CommonEmailAddress;
import au.org.consumerdatastandards.holder.model.CommonOrganisationDetail;
import au.org.consumerdatastandards.holder.model.CommonPersonDetail;
import au.org.consumerdatastandards.holder.model.OrganisationUser;
import au.org.consumerdatastandards.holder.model.PersonUser;
import au.org.consumerdatastandards.holder.model.User;
import au.org.consumerdatastandards.holder.model.banking.BankingAccount;
import au.org.consumerdatastandards.holder.model.banking.BankingAccountDetail;
import au.org.consumerdatastandards.holder.model.banking.BankingBalance;
import au.org.consumerdatastandards.holder.model.banking.BankingProductV2Detail;
import au.org.consumerdatastandards.holder.model.banking.BankingTransactionDetail;
import au.org.consumerdatastandards.holder.model.energy.EnergyPlanDetailEntity;
import au.org.consumerdatastandards.holder.repository.CommonOrganisationRepository;
import au.org.consumerdatastandards.holder.repository.CommonPersonDetailRepository;
import au.org.consumerdatastandards.holder.repository.CommonPersonRepository;
import au.org.consumerdatastandards.holder.repository.UserRepository;
import au.org.consumerdatastandards.holder.repository.banking.BankingAccountDetailRepository;
import au.org.consumerdatastandards.holder.repository.banking.BankingAccountRepository;
import au.org.consumerdatastandards.holder.repository.banking.BankingBalanceRepository;
import au.org.consumerdatastandards.holder.repository.banking.BankingProductDetailV2Repository;
import au.org.consumerdatastandards.holder.repository.banking.BankingTransactionDetailRepository;
import au.org.consumerdatastandards.holder.repository.energy.EnergyPlanDetailRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class CdsDataLoader {

    private static final Logger LOGGER = LogManager.getLogger(CdsDataLoader.class);
    private static final String DEFAULT_PASSWORD = "password";

    // Banking repositories
    private BankingProductDetailV2Repository productDetailRepository;
    private BankingAccountDetailRepository accountDetailRepository;
    private BankingAccountRepository accountRepository;
    private BankingBalanceRepository balanceRepository;
    private CommonPersonDetailRepository commonPersonDetailRepository;
    private BankingTransactionDetailRepository transactionDetailRepository;
    private UserRepository userRepository;
    private CommonPersonRepository commonPersonRepository;
    private CommonOrganisationRepository commonOrganisationRepository;

    // Energy repositories
    private final EnergyPlanDetailRepository energyPlanDetailRepository;

    private ObjectMapper objectMapper;
    private int personUserIdSeq = 0;
    private int organisationUserIdSeq = 0;

    @Autowired
    public CdsDataLoader(BankingProductDetailV2Repository productDetailRepository,
                         BankingAccountDetailRepository accountDetailRepository,
                         BankingAccountRepository accountRepository,
                         BankingBalanceRepository balanceRepository,
                         CommonPersonDetailRepository commonPersonDetailRepository,
                         BankingTransactionDetailRepository transactionDetailRepository,
                         EnergyPlanDetailRepository energyPlanDetailRepository,
                         UserRepository userRepository,
                         CommonPersonRepository commonPersonRepository,
                         CommonOrganisationRepository commonOrganisationRepository) {
        this.productDetailRepository = productDetailRepository;
        this.accountDetailRepository = accountDetailRepository;
        this.accountRepository = accountRepository;
        this.balanceRepository = balanceRepository;
        this.commonPersonDetailRepository = commonPersonDetailRepository;
        this.transactionDetailRepository = transactionDetailRepository;
        this.energyPlanDetailRepository = energyPlanDetailRepository;
        this.userRepository = userRepository;
        this.commonPersonRepository = commonPersonRepository;
        this.commonOrganisationRepository = commonOrganisationRepository;
        this.objectMapper = new ObjectMapper()
            .registerModule(new ParameterNamesModule())
            .registerModule(new Jdk8Module())
            .registerModule(new JavaTimeModule());
    }

    public void loadAll() throws IOException {
        // Banking
        load("payloads/banking/accounts", accountDetailRepository, BankingAccountDetail.class);
        load("payloads/banking/balances", balanceRepository, BankingBalance.class);
        load("payloads/banking/persons", commonPersonDetailRepository, CommonPersonDetail.class);
        load("payloads/banking/products", productDetailRepository, BankingProductV2Detail.class);
        load("payloads/banking/transactions", transactionDetailRepository, BankingTransactionDetail.class);

        // Energy
        load("payloads/energy/plans", energyPlanDetailRepository, EnergyPlanDetailEntity.class);
    }

    private <T, U> void load(String fileOrFolder, CrudRepository<T, U> repository, Class<T> dataType) throws IOException {
        File file = new File(fileOrFolder);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File oneFile : files) {
                load(oneFile.getAbsolutePath(), repository, dataType);
            }
        } else {
            LOGGER.info("Loading data from {}", file.getAbsolutePath());
            T obj = objectMapper.readValue(file, dataType);

            if (dataType.isAssignableFrom(BankingBalance.class)) {
                assignAccountToBalance((BankingBalance) obj);
            }

            Object savedEntity = repository.save(obj);
            if (CommonPersonDetail.class.equals(dataType)) {
                CommonPersonDetail commonPersonDetail = (CommonPersonDetail)savedEntity;
                createPersonUser(commonPersonDetail);
            } else if (CommonOrganisationDetail.class.equals(dataType)) {
                CommonOrganisationDetail commonOrganisationDetail = (CommonOrganisationDetail)savedEntity;
                createOrganisationUser(commonOrganisationDetail);
            }
        }
    }

    private void assignAccountToBalance(BankingBalance balance) {
        Optional<BankingAccount> account = accountRepository.findById(balance.getAccountId());
        if (account.isPresent()) {
            balance.setBankingAccount(account.get());
        } else {
            LOGGER.info("Unresolved account ID in balance {}", balance.getAccountId());
        }
    }

    private void createOrganisationUser(CommonOrganisationDetail commonOrganisationDetail) {
        OrganisationUser user = new OrganisationUser();
        user.setGivenName(commonOrganisationDetail.getAgentFirstName());
        user.setFamilyName(commonOrganisationDetail.getAgentLastName());
        user.setEmail(user.getGivenName() + "." + user.getFamilyName() + "@test.org");
        user.setEmailVerified(true);
        user.setGender(User.Gender.female);
        user.setPasswordHash(generateDefaultPasswordHash());
        user.setOrganisation(commonOrganisationRepository.findById(commonOrganisationDetail.getId()).orElse(null));
        user.setId("org" + organisationUserIdSeq++);
        userRepository.save(user);
    }

    private void createPersonUser(CommonPersonDetail commonPersonDetail) {
        PersonUser user = new PersonUser();
        user.setGivenName(commonPersonDetail.getFirstName());
        user.setFamilyName(commonPersonDetail.getLastName());
        List<CommonEmailAddress> emailAddresses = commonPersonDetail.getEmailAddresses();
        if(emailAddresses != null && !emailAddresses.isEmpty()) {
            user.setEmail(emailAddresses.get(0).getAddress());
        } else {
            user.setEmail(user.getGivenName() + "." + user.getFamilyName() + "@test.com");
        }
        user.setEmailVerified(true);
        user.setUpdatedAt(new Date().getTime());
        user.setGender(User.Gender.female);
        user.setPasswordHash(generateDefaultPasswordHash());
        user.setPerson(commonPersonRepository.findById(commonPersonDetail.getId()).orElse(null));
        user.setId("person" + personUserIdSeq++);
        userRepository.save(user);
    }

    private String generateDefaultPasswordHash() {
        return DigestUtils.sha256Hex(DEFAULT_PASSWORD);
    }
}
