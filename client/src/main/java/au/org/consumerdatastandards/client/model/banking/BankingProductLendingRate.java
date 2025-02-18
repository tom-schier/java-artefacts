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

public class BankingProductLendingRate<T extends BankingProductRateTier> {

    public enum LendingRateType {
        BUNDLE_DISCOUNT_FIXED,
        BUNDLE_DISCOUNT_VARIABLE,
        CASH_ADVANCE,
        DISCOUNT,
        FLOATING,
        INTRODUCTORY,
        MARKET_LINKED,
        PENALTY,
        PURCHASE,
        VARIABLE,
        FIXED
    }

    public enum InterestPaymentDue {
        ADVANCE,
        ARREARS
    }

    public enum RepaymentType {
        INTEREST_ONLY,
        PRINCIPAL_AND_INTEREST
    }

    public enum LoanPurpose {
        OWNER_OCCUPIED,
        INVESTMENT
    }

    private LendingRateType lendingRateType;

    private String rate;

    private String comparisonRate;

    private String calculationFrequency;

    private String applicationFrequency;

    private InterestPaymentDue interestPaymentDue;

    private RepaymentType repaymentType;

    private LoanPurpose loanPurpose;

    private List<T> tiers;

    private String additionalValue;

    private String additionalInfo;

    private String additionalInfoUri;

    /**
     * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
     * @return lendingRateType
     */
    public LendingRateType getLendingRateType() {
        return lendingRateType;
    }

    public void setLendingRateType(LendingRateType lendingRateType) {
        this.lendingRateType = lendingRateType;
    }

    /**
     * The rate to be applied
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * A comparison rate equivalent for this rate
     * @return comparisonRate
     */
    public String getComparisonRate() {
        return comparisonRate;
    }

    public void setComparisonRate(String comparisonRate) {
        this.comparisonRate = comparisonRate;
    }

    /**
     * The period after which the rate is applied to the balance to calculate the amount due for the period. Calculation of the amount is often daily (as balances may change) but accumulated until the total amount is 'applied' to the account (see applicationFrequency). Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
     * @return calculationFrequency
     */
    public String getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(String calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    /**
     * The period after which the calculated amount(s) (see calculationFrequency) are 'applied' (i.e. debited or credited) to the account. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
     * @return applicationFrequency
     */
    public String getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(String applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    /**
     * When loan payments are due to be paid within each period. The investment benefit of earlier payments affect the rate that can be offered
     * @return interestPaymentDue
     */
    public InterestPaymentDue getInterestPaymentDue() {
        return interestPaymentDue;
    }

    public void setInterestPaymentDue(InterestPaymentDue interestPaymentDue) {
        this.interestPaymentDue = interestPaymentDue;
    }

    /**
     * Options in place for repayments. If absent, the lending rate is applicable to all repayment types
     * @return repaymentType
     */
    public RepaymentType getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(RepaymentType repaymentType) {
        this.repaymentType = repaymentType;
    }

    /**
     * The reason for taking out the loan. If absent, the lending rate is applicable to all loan purposes
     * @return loanPurpose
     */
    public LoanPurpose getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(LoanPurpose loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    /**
     * Rate tiers applicable for this rate
     * @return tiers
     */
    public List<T> getTiers() {
        return tiers;
    }

    public void setTiers(List<T> tiers) {
        this.tiers = tiers;
    }

    /**
     * Generic field containing additional information relevant to the [lendingRateType](#tocSproductlendingratetypedoc) specified. Whether mandatory or not is dependent on the value of [lendingRateType](#tocSproductlendingratetypedoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Display text providing more information on the rate.
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this rate
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
        BankingProductLendingRate<T> bankingProductLendingRate = (BankingProductLendingRate<T>) o;
        return Objects.equals(this.lendingRateType, bankingProductLendingRate.lendingRateType) &&
            Objects.equals(this.rate, bankingProductLendingRate.rate) &&
            Objects.equals(this.comparisonRate, bankingProductLendingRate.comparisonRate) &&
            Objects.equals(this.calculationFrequency, bankingProductLendingRate.calculationFrequency) &&
            Objects.equals(this.applicationFrequency, bankingProductLendingRate.applicationFrequency) &&
            Objects.equals(this.interestPaymentDue, bankingProductLendingRate.interestPaymentDue) &&
            Objects.equals(this.tiers, bankingProductLendingRate.tiers) &&
            Objects.equals(this.repaymentType, bankingProductLendingRate.repaymentType) &&
            Objects.equals(this.loanPurpose, bankingProductLendingRate.loanPurpose) &&
            Objects.equals(this.additionalValue, bankingProductLendingRate.additionalValue) &&
            Objects.equals(this.additionalInfo, bankingProductLendingRate.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductLendingRate.additionalInfoUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            lendingRateType,
            rate,
            comparisonRate,
            calculationFrequency,
            applicationFrequency,
            interestPaymentDue,
            repaymentType,
            loanPurpose,
            tiers,
            additionalValue,
            additionalInfo,
            additionalInfoUri);
    }

    @Override
    public String toString() {
        return "class BankingProductLendingRate {\n" +
            "   lendingRateType: " + toIndentedString(lendingRateType) + "\n" + 
            "   rate: " + toIndentedString(rate) + "\n" + 
            "   comparisonRate: " + toIndentedString(comparisonRate) + "\n" + 
            "   calculationFrequency: " + toIndentedString(calculationFrequency) + "\n" + 
            "   applicationFrequency: " + toIndentedString(applicationFrequency) + "\n" + 
            "   interestPaymentDue: " + toIndentedString(interestPaymentDue) + "\n" + 
            "   repaymentType: " + toIndentedString(repaymentType) + "\n" +
            "   loanPurpose: " + toIndentedString(loanPurpose) + "\n" +
            "   tiers: " + toIndentedString(tiers) + "\n" +
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
