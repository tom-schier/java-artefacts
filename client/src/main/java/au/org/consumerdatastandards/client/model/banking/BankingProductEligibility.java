/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingProductEligibility {

    public enum EligibilityType {
        BUSINESS,
        EMPLOYMENT_STATUS,
        MAX_AGE,
        MIN_AGE,
        MIN_INCOME,
        MIN_TURNOVER,
        NATURAL_PERSON,
        PENSION_RECIPIENT,
        RESIDENCY_STATUS,
        STAFF,
        STUDENT,
        OTHER
    }

    private EligibilityType eligibilityType;

    private String additionalValue;

    private String additionalInfo;

    private String additionalInfoUri;

    /**
     * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
     * @return eligibilityType
     */
    public EligibilityType getEligibilityType() {
        return eligibilityType;
    }

    public void setEligibilityType(EligibilityType eligibilityType) {
        this.eligibilityType = eligibilityType;
    }

    /**
     * Generic field containing additional information relevant to the [eligibilityType](#tocSproducteligibilitytypedoc) specified. Whether mandatory or not is dependent on the value of [eligibilityType](#tocSproducteligibilitytypedoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Display text providing more information on the [eligibility](#tocSproducteligibilitytypedoc) criteria. Mandatory if the field is set to OTHER
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this eligibility criteria
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
        BankingProductEligibility bankingProductEligibility = (BankingProductEligibility) o;
        return Objects.equals(this.eligibilityType, bankingProductEligibility.eligibilityType) &&
            Objects.equals(this.additionalValue, bankingProductEligibility.additionalValue) &&
            Objects.equals(this.additionalInfo, bankingProductEligibility.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductEligibility.additionalInfoUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            eligibilityType,
            additionalValue,
            additionalInfo,
            additionalInfoUri);
    }

    @Override
    public String toString() {
        return "class BankingProductEligibility {\n" +
            "   eligibilityType: " + toIndentedString(eligibilityType) + "\n" + 
            "   additionalValue: " + toIndentedString(additionalValue) + "\n" + 
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
