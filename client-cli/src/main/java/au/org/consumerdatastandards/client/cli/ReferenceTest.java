/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.cli;

import au.org.consumerdatastandards.client.ApiClientOptions;
import au.org.consumerdatastandards.client.ApiException;
import au.org.consumerdatastandards.client.JSON;
import au.org.consumerdatastandards.client.model.banking.BankingAccountDetail;
import au.org.consumerdatastandards.client.model.banking.BankingAuthorisedEntity;
import au.org.consumerdatastandards.client.model.banking.BankingBalance;
import au.org.consumerdatastandards.client.model.banking.BankingBalancePurse;
import au.org.consumerdatastandards.client.model.banking.BankingBillerPayee;
import au.org.consumerdatastandards.client.model.banking.BankingCreditCardAccount;
import au.org.consumerdatastandards.client.model.banking.BankingDirectDebit;
import au.org.consumerdatastandards.client.model.banking.BankingDomesticPayee;
import au.org.consumerdatastandards.client.model.banking.BankingDomesticPayeeAccount;
import au.org.consumerdatastandards.client.model.banking.BankingDomesticPayeeCard;
import au.org.consumerdatastandards.client.model.banking.BankingDomesticPayeePayId;
import au.org.consumerdatastandards.client.model.banking.BankingInternationalPayee;
import au.org.consumerdatastandards.client.model.banking.BankingInternationalPayeeBankDetails;
import au.org.consumerdatastandards.client.model.banking.BankingInternationalPayeeBankDetailsBankAddress;
import au.org.consumerdatastandards.client.model.banking.BankingInternationalPayeeBeneficiaryDetails;
import au.org.consumerdatastandards.client.model.banking.BankingLoanAccount;
import au.org.consumerdatastandards.client.model.banking.BankingPayee;
import au.org.consumerdatastandards.client.model.banking.BankingPayeeDetail;
import au.org.consumerdatastandards.client.model.banking.BankingProductAdditionalInformationV1;
import au.org.consumerdatastandards.client.model.banking.BankingProductBundle;
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.BankingProductConstraint;
import au.org.consumerdatastandards.client.model.banking.BankingProductDepositRate;
import au.org.consumerdatastandards.client.model.banking.BankingProductDiscount;
import au.org.consumerdatastandards.client.model.banking.BankingProductDiscountEligibility;
import au.org.consumerdatastandards.client.model.banking.BankingProductEligibility;
import au.org.consumerdatastandards.client.model.banking.BankingProductFeature;
import au.org.consumerdatastandards.client.model.banking.BankingProductFee;
import au.org.consumerdatastandards.client.model.banking.BankingProductLendingRate;
import au.org.consumerdatastandards.client.model.banking.BankingProductRateCondition;
import au.org.consumerdatastandards.client.model.banking.BankingProductRateTierSubTier;
import au.org.consumerdatastandards.client.model.banking.BankingProductRateTierV1;
import au.org.consumerdatastandards.client.model.banking.BankingProductRateTierV3;
import au.org.consumerdatastandards.client.model.banking.BankingProductV1;
import au.org.consumerdatastandards.client.model.banking.BankingProductDetailV1;
import au.org.consumerdatastandards.client.model.banking.BankingProductV2;
import au.org.consumerdatastandards.client.model.banking.BankingProductCardArt;
import au.org.consumerdatastandards.client.model.banking.BankingProductDetailV2;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPayment;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentFrom;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentInterval;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentRecurrence;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentRecurrenceEventBased;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentRecurrenceIntervalSchedule;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentRecurrenceLastWeekday;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentRecurrenceOnceOff;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentSet;
import au.org.consumerdatastandards.client.model.banking.BankingScheduledPaymentTo;
import au.org.consumerdatastandards.client.model.banking.BankingTermDepositAccount;
import au.org.consumerdatastandards.client.model.banking.BankingTransaction;
import au.org.consumerdatastandards.client.model.banking.BankingTransactionDetail;
import au.org.consumerdatastandards.client.model.banking.BankingTransactionDetailExtendedData;
import au.org.consumerdatastandards.client.model.banking.BankingTransactionDetailExtendedDataX2p101Payload;
import au.org.consumerdatastandards.client.model.CommonEmailAddress;
import au.org.consumerdatastandards.client.model.CommonOrganisation;
import au.org.consumerdatastandards.client.model.CommonOrganisationDetail;
import au.org.consumerdatastandards.client.model.CommonPAFAddress;
import au.org.consumerdatastandards.client.model.CommonPerson;
import au.org.consumerdatastandards.client.model.CommonPersonDetail;
import au.org.consumerdatastandards.client.model.CommonPhoneNumber;
import au.org.consumerdatastandards.client.model.CommonPhysicalAddress;
import au.org.consumerdatastandards.client.model.CommonPhysicalAddressWithPurpose;
import au.org.consumerdatastandards.client.model.CommonSimpleAddress;
import au.org.consumerdatastandards.client.model.DiscoveryOutage;
import au.org.consumerdatastandards.client.model.Error;
import au.org.consumerdatastandards.client.model.Links;
import au.org.consumerdatastandards.client.model.LinksPaginated;
import au.org.consumerdatastandards.client.model.banking.ParamAccountOpenStatus;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIds;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIdsData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountListData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountsBalanceById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountsBalanceList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountsBalanceListData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingDirectDebitAuthorisationList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingDirectDebitAuthorisationListData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingPayeeById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingPayeeList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingPayeeListData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingProductById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingProductList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingProductListData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingScheduledPaymentsList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingScheduledPaymentsListData;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingTransactionById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingTransactionList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingTransactionListData;
import au.org.consumerdatastandards.client.model.ResponseCommonCustomer;
import au.org.consumerdatastandards.client.model.ResponseCommonCustomerData;
import au.org.consumerdatastandards.client.model.ResponseCommonCustomerDetail;
import au.org.consumerdatastandards.client.model.ResponseCommonCustomerDetailData;
import au.org.consumerdatastandards.client.model.ResponseCommonDiscoveryStatus;
import au.org.consumerdatastandards.client.model.ResponseCommonDiscoveryStatusData;
import au.org.consumerdatastandards.client.model.ResponseDiscoveryOutagesList;
import au.org.consumerdatastandards.client.model.ResponseDiscoveryOutagesListData;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;

@ShellComponent
@ShellCommandGroup("Reference Testing")
public class ReferenceTest extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReferenceTest.class);
    private static final String EXCEPTION_DESERIALISING_FILE = "Exception deserialising file {}: ";
    private final static String MODEL_PACKAGE_PREFIX = "au.org.consumerdatastandards.client.model.";

    private final static Type[] responseModels = {
            new TypeToken<BankingAccountDetail>() {}.getType(),
            new TypeToken<BankingAuthorisedEntity>() {}.getType(),
            new TypeToken<BankingBalance>() {}.getType(),
            new TypeToken<BankingBalancePurse>() {}.getType(),
            new TypeToken<BankingBillerPayee>() {}.getType(),
            new TypeToken<BankingCreditCardAccount>() {}.getType(),
            new TypeToken<BankingDirectDebit>() {}.getType(),
            new TypeToken<BankingDomesticPayee>() {}.getType(),
            new TypeToken<BankingDomesticPayeeAccount>() {}.getType(),
            new TypeToken<BankingDomesticPayeeCard>() {}.getType(),
            new TypeToken<BankingDomesticPayeePayId>() {}.getType(),
            new TypeToken<BankingInternationalPayee>() {}.getType(),
            new TypeToken<BankingInternationalPayeeBankDetails>() {}.getType(),
            new TypeToken<BankingInternationalPayeeBankDetailsBankAddress>() {}.getType(),
            new TypeToken<BankingInternationalPayeeBeneficiaryDetails>() {}.getType(),
            new TypeToken<BankingLoanAccount>() {}.getType(),
            new TypeToken<BankingPayee>() {}.getType(),
            new TypeToken<BankingPayeeDetail>() {}.getType(),
            new TypeToken<BankingProductAdditionalInformationV1>() {}.getType(),
            new TypeToken<BankingProductBundle>() {}.getType(),
            new TypeToken<BankingProductCategory>() {}.getType(),
            new TypeToken<BankingProductConstraint>() {}.getType(),
            new TypeToken<BankingProductDepositRate<BankingProductRateTierV1>>() {}.getType(),
            new TypeToken<BankingProductDepositRate<BankingProductRateTierV3>>() {}.getType(),
            new TypeToken<BankingProductDiscount>() {}.getType(),
            new TypeToken<BankingProductDiscountEligibility>() {}.getType(),
            new TypeToken<BankingProductEligibility>() {}.getType(),
            new TypeToken<BankingProductFeature>() {}.getType(),
            new TypeToken<BankingProductFee>() {}.getType(),
            new TypeToken<BankingProductLendingRate<BankingProductRateTierV1>>() {}.getType(),
            new TypeToken<BankingProductLendingRate<BankingProductRateTierV3>>() {}.getType(),
            new TypeToken<BankingProductRateCondition>() {}.getType(),
            new TypeToken<BankingProductRateTierV1>() {}.getType(),
            new TypeToken<BankingProductRateTierV3>() {}.getType(),
            new TypeToken<BankingProductRateTierSubTier>() {}.getType(),
            new TypeToken<BankingProductV1>() {}.getType(),
            new TypeToken<BankingProductDetailV1>() {}.getType(),
            new TypeToken<BankingProductV2>() {}.getType(),
            new TypeToken<BankingProductCardArt>() {}.getType(),
            new TypeToken<BankingProductDetailV2>() {}.getType(),
            new TypeToken<BankingScheduledPayment>() {}.getType(),
            new TypeToken<BankingScheduledPaymentFrom>() {}.getType(),
            new TypeToken<BankingScheduledPaymentInterval>() {}.getType(),
            new TypeToken<BankingScheduledPaymentRecurrence>() {}.getType(),
            new TypeToken<BankingScheduledPaymentRecurrenceEventBased>() {}.getType(),
            new TypeToken<BankingScheduledPaymentRecurrenceIntervalSchedule>() {}.getType(),
            new TypeToken<BankingScheduledPaymentRecurrenceLastWeekday>() {}.getType(),
            new TypeToken<BankingScheduledPaymentRecurrenceOnceOff>() {}.getType(),
            new TypeToken<BankingScheduledPaymentSet>() {}.getType(),
            new TypeToken<BankingScheduledPaymentTo>() {}.getType(),
            new TypeToken<BankingTermDepositAccount>() {}.getType(),
            new TypeToken<BankingTransaction>() {}.getType(),
            new TypeToken<BankingTransactionDetail>() {}.getType(),
            new TypeToken<BankingTransactionDetailExtendedData>() {}.getType(),
            new TypeToken<BankingTransactionDetailExtendedDataX2p101Payload>() {}.getType(),
            new TypeToken<CommonEmailAddress>() {}.getType(),
            new TypeToken<CommonOrganisation>() {}.getType(),
            new TypeToken<CommonOrganisationDetail>() {}.getType(),
            new TypeToken<CommonPAFAddress>() {}.getType(),
            new TypeToken<CommonPerson>() {}.getType(),
            new TypeToken<CommonPersonDetail>() {}.getType(),
            new TypeToken<CommonPhoneNumber>() {}.getType(),
            new TypeToken<CommonPhysicalAddress>() {}.getType(),
            new TypeToken<CommonPhysicalAddressWithPurpose>() {}.getType(),
            new TypeToken<CommonSimpleAddress>() {}.getType(),
            new TypeToken<DiscoveryOutage>() {}.getType(),
            new TypeToken<Error>() {}.getType(),
            new TypeToken<Links>() {}.getType(),
            new TypeToken<LinksPaginated>() {}.getType(),
            new TypeToken<ParamAccountOpenStatus>() {}.getType(),
            new TypeToken<RequestAccountIds>() {}.getType(),
            new TypeToken<RequestAccountIdsData>() {}.getType(),
            new TypeToken<ResponseBankingAccountById>() {}.getType(),
            new TypeToken<ResponseBankingAccountList>() {}.getType(),
            new TypeToken<ResponseBankingAccountListData>() {}.getType(),
            new TypeToken<ResponseBankingAccountsBalanceById>() {}.getType(),
            new TypeToken<ResponseBankingAccountsBalanceList>() {}.getType(),
            new TypeToken<ResponseBankingAccountsBalanceListData>() {}.getType(),
            new TypeToken<ResponseBankingDirectDebitAuthorisationList>() {}.getType(),
            new TypeToken<ResponseBankingDirectDebitAuthorisationListData>() {}.getType(),
            new TypeToken<ResponseBankingPayeeById>() {}.getType(),
            new TypeToken<ResponseBankingPayeeList>() {}.getType(),
            new TypeToken<ResponseBankingPayeeListData>() {}.getType(),
            new TypeToken<ResponseBankingProductById<BankingProductDetailV1>>() {}.getType(),
            new TypeToken<ResponseBankingProductById<BankingProductDetailV2>>() {}.getType(),
            new TypeToken<ResponseBankingProductList<BankingProductV1>>() {}.getType(),
            new TypeToken<ResponseBankingProductList<BankingProductV2>>() {}.getType(),
            new TypeToken<ResponseBankingProductListData<BankingProductV1>>() {}.getType(),
            new TypeToken<ResponseBankingProductListData<BankingProductV2>>() {}.getType(),
            new TypeToken<ResponseBankingScheduledPaymentsList>() {}.getType(),
            new TypeToken<ResponseBankingScheduledPaymentsListData>() {}.getType(),
            new TypeToken<ResponseBankingTransactionById>() {}.getType(),
            new TypeToken<ResponseBankingTransactionList>() {}.getType(),
            new TypeToken<ResponseBankingTransactionListData>() {}.getType(),
            new TypeToken<ResponseCommonCustomer>() {}.getType(),
            new TypeToken<ResponseCommonCustomerData>() {}.getType(),
            new TypeToken<ResponseCommonCustomerDetail>() {}.getType(),
            new TypeToken<ResponseCommonCustomerDetailData>() {}.getType(),
            new TypeToken<ResponseCommonDiscoveryStatus>() {}.getType(),
            new TypeToken<ResponseCommonDiscoveryStatusData>() {}.getType(),
            new TypeToken<ResponseDiscoveryOutagesList>() {}.getType(),
            new TypeToken<ResponseDiscoveryOutagesListData>() {}.getType()
    };

    @Autowired
    private ApiClientOptions apiClientOptions;

    @ShellMethod("Retrieve current conformance check status")
    public void payloadValidationStatus() {
        LOGGER.info("Automatic payload validation setting: {}", apiClientOptions.isValidationEnabled());
    }
    
    @ShellMethod("Validate all Payloads Automatically")
    public void autoValidate(@ShellOption(help = "true or false", defaultValue = ShellOption.NULL) String enableValidation) {
        if (enableValidation != null) {
            apiClientOptions.setValidationEnabled(Boolean.parseBoolean(enableValidation));
        }
        payloadValidationStatus();
    }

    @ShellMethod("Validate json payload(s) against CDS")
    public void validatePath(@ShellOption(value = "-f", help = "payload file or folder") String fileOrFolder,
                             @ShellOption(value="-m", help = "model", defaultValue = "") String model) throws ApiException {
        
        File file = new File(fileOrFolder);
        if (!file.exists()) {
            LOGGER.error("Unable to find the specified file for validation: {}", fileOrFolder);
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null || files.length == 0) {
                LOGGER.error("No files found in directory: {}", file.getAbsolutePath());
            } else {
                for (File oneFile : files) {
                    validatePath(oneFile.getAbsolutePath(), model);
                }
            }
        } else {
            JSON json = new JSON(true);

            boolean success = false;
            for (Type type : responseModels) {
                String typeName = type.getTypeName().replaceAll(MODEL_PACKAGE_PREFIX, "");
                LOGGER.trace("Trying model: {}", typeName);
                if (model.isEmpty() || typeName.equals(model)) {
                    try {
                        Object obj = json.deserialize(new FileReader(file), type);
                        success = true;
                        break;
                    } catch (FileNotFoundException e) {
                        LOGGER.error("File not found: {}", file.getAbsolutePath());
                        return;
                    } catch (Exception e) {
                        if (model.isEmpty()) {
                            LOGGER.trace(EXCEPTION_DESERIALISING_FILE, fileOrFolder, e);
                        } else {
                            LOGGER.error(EXCEPTION_DESERIALISING_FILE, fileOrFolder, e);
                            return;
                        }
                    }
                }
            }
            if (!success) {
                throw new ApiException("Could not find a matching model." + (model.isEmpty() ? " Try the -m option." : ""));
            }
            LOGGER.info("Validation of {} successful", file.getAbsolutePath());
        }
    }

    @ShellMethod("List top-level payload models")
    public String listPayloadModels() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        for (Type topLevelModel : responseModels) {
            pw.println(topLevelModel.getTypeName().replaceAll(MODEL_PACKAGE_PREFIX, ""));
        }
        return sw.toString();
    }
}
