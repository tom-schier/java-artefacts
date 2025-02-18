/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingDomesticPayee {

    public enum PayeeAccountUType {
        account,
        card,
        payId
    }

    private PayeeAccountUType payeeAccountUType;

    private BankingDomesticPayeeAccount account;

    private BankingDomesticPayeeCard card;

    private BankingDomesticPayeePayId payId;

    /**
     * Type of account object included. Valid values are: **account** A standard Australian account defined by BSB/Account Number. **card** A credit or charge card to pay to (note that PANs are masked). **payId** A PayID recognised by NPP
     * @return payeeAccountUType
     */
    public PayeeAccountUType getPayeeAccountUType() {
        return payeeAccountUType;
    }

    public void setPayeeAccountUType(PayeeAccountUType payeeAccountUType) {
        this.payeeAccountUType = payeeAccountUType;
    }

    /**
     * Get account
     * @return account
     */
    public BankingDomesticPayeeAccount getAccount() {
        return account;
    }

    public void setAccount(BankingDomesticPayeeAccount account) {
        this.account = account;
    }

    /**
     * Get card
     * @return card
     */
    public BankingDomesticPayeeCard getCard() {
        return card;
    }

    public void setCard(BankingDomesticPayeeCard card) {
        this.card = card;
    }

    /**
     * Get payId
     * @return payId
     */
    public BankingDomesticPayeePayId getPayId() {
        return payId;
    }

    public void setPayId(BankingDomesticPayeePayId payId) {
        this.payId = payId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingDomesticPayee bankingDomesticPayee = (BankingDomesticPayee) o;
        return Objects.equals(this.payeeAccountUType, bankingDomesticPayee.payeeAccountUType) &&
            Objects.equals(this.account, bankingDomesticPayee.account) &&
            Objects.equals(this.card, bankingDomesticPayee.card) &&
            Objects.equals(this.payId, bankingDomesticPayee.payId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            payeeAccountUType,
            account,
            card,
            payId);
    }

    @Override
    public String toString() {
        return "class BankingDomesticPayee {\n" +
            "   payeeAccountUType: " + toIndentedString(payeeAccountUType) + "\n" +
            "   account: " + toIndentedString(account) + "\n" +
            "   card: " + toIndentedString(card) + "\n" +
            "   payId: " + toIndentedString(payId) + "\n" +
            "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
