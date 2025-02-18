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

public class ResponseBankingDirectDebitAuthorisationListData {

    private List<BankingDirectDebit> directDebitAuthorisations;

    /**
     * The list of authorisations returned
     * @return directDebitAuthorisations
     */
    public List<BankingDirectDebit> getDirectDebitAuthorisations() {
        return directDebitAuthorisations;
    }

    public void setDirectDebitAuthorisations(List<BankingDirectDebit> directDebitAuthorisations) {
        this.directDebitAuthorisations = directDebitAuthorisations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingDirectDebitAuthorisationListData responseBankingDirectDebitAuthorisationListData = (ResponseBankingDirectDebitAuthorisationListData) o;
        return Objects.equals(this.directDebitAuthorisations, responseBankingDirectDebitAuthorisationListData.directDebitAuthorisations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            directDebitAuthorisations);
    }

    @Override
    public String toString() {
        return "class ResponseBankingDirectDebitAuthorisationListData {\n" +
            "   directDebitAuthorisations: " + toIndentedString(directDebitAuthorisations) + "\n" + 
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
