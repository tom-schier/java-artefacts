/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;
/**
 * Defines a condition for the applicability of a tiered rate
 */
public class BankingProductRateCondition {

    private String additionalInfo;

    private String additionalInfoUri;

    /**
     * Display text providing more information on the condition
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this condition
     * @return additionalInfoUri
     */
    public String getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(String additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductRateCondition bankingProductRateCondition = (BankingProductRateCondition) o;
        return Objects.equals(this.additionalInfo, bankingProductRateCondition.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductRateCondition.additionalInfoUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additionalInfo,
            additionalInfoUri);
    }

    @Override
    public String toString() {
        return "class BankingProductRateCondition {\n" +
            "   additionalInfo: " + toIndentedString(additionalInfo) + "\n" + 
            "   additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" + 
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
