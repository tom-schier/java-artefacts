/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;
/**
 * Object that contains links to additional information on specific topics
 */
public class BankingProductAdditionalInformation {

    private String overviewUri;

    private String termsUri;

    private String eligibilityUri;

    private String feesAndPricingUri;

    private String bundleUri;

    /**
     * General overview of the product
     * @return overviewUri
     */
    public String getOverviewUri() {
        return overviewUri;
    }

    public void setOverviewUri(String overviewUri) {
        this.overviewUri = overviewUri;
    }

    /**
     * Terms and conditions for the product
     * @return termsUri
     */
    public String getTermsUri() {
        return termsUri;
    }

    public void setTermsUri(String termsUri) {
        this.termsUri = termsUri;
    }

    /**
     * Eligibility rules and criteria for the product
     * @return eligibilityUri
     */
    public String getEligibilityUri() {
        return eligibilityUri;
    }

    public void setEligibilityUri(String eligibilityUri) {
        this.eligibilityUri = eligibilityUri;
    }

    /**
     * Description of fees, pricing, discounts, exemptions and bonuses for the product
     * @return feesAndPricingUri
     */
    public String getFeesAndPricingUri() {
        return feesAndPricingUri;
    }

    public void setFeesAndPricingUri(String feesAndPricingUri) {
        this.feesAndPricingUri = feesAndPricingUri;
    }

    /**
     * Description of a bundle that this product can be part of
     * @return bundleUri
     */
    public String getBundleUri() {
        return bundleUri;
    }

    public void setBundleUri(String bundleUri) {
        this.bundleUri = bundleUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductAdditionalInformation bankingProductAdditionalInformation = (BankingProductAdditionalInformation) o;
        return Objects.equals(this.overviewUri, bankingProductAdditionalInformation.overviewUri) &&
            Objects.equals(this.termsUri, bankingProductAdditionalInformation.termsUri) &&
            Objects.equals(this.eligibilityUri, bankingProductAdditionalInformation.eligibilityUri) &&
            Objects.equals(this.feesAndPricingUri, bankingProductAdditionalInformation.feesAndPricingUri) &&
            Objects.equals(this.bundleUri, bankingProductAdditionalInformation.bundleUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            overviewUri,
            termsUri,
            eligibilityUri,
            feesAndPricingUri,
            bundleUri);
    }

    @Override
    public String toString() {
        return "class BankingProductAdditionalInformation {\n" +
            "   overviewUri: " + toIndentedString(overviewUri) + "\n" +
            "   termsUri: " + toIndentedString(termsUri) + "\n" +
            "   eligibilityUri: " + toIndentedString(eligibilityUri) + "\n" +
            "   feesAndPricingUri: " + toIndentedString(feesAndPricingUri) + "\n" +
            "   bundleUri: " + toIndentedString(bundleUri) + "\n" +
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
