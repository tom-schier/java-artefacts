package au.org.consumerdatastandards.holder.repository.banking;

import au.org.consumerdatastandards.holder.model.banking.BankingAccountDetail;
import org.springframework.data.repository.CrudRepository;

public interface BankingAccountDetailRepository extends CrudRepository<BankingAccountDetail, String> { }
