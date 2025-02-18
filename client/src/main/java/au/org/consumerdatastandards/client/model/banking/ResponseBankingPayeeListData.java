/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class ResponseBankingPayeeListData {

    private List<BankingPayee> payees;

    /**
     * The list of payees returned
     * @return payees
     */
    public List<BankingPayee> getPayees() {
        return payees;
    }

    public void setPayees(List<BankingPayee> payees) {
        this.payees = payees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingPayeeListData responseBankingPayeeListData = (ResponseBankingPayeeListData) o;
        return Objects.equals(this.payees, responseBankingPayeeListData.payees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            payees);
    }

    @Override
    public String toString() {
        return "class ResponseBankingPayeeListData {\n" +
            "   payees: " + toIndentedString(payees) + "\n" + 
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
