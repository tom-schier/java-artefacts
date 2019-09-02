/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the cds-codegen package
 * https:*github.com/ConsumerDataStandardsAustralia/cds-codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
import java.util.List;
import java.math.BigDecimal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class BankingProductDiscount {

  /**
   * Description of the discount
   */
  @SerializedName("description")
  private String description;

  /**
   * The type of discount. See the next section for an overview
   * of valid values and their meaning
   */
  @SerializedName("discountType")
  private DiscountType discountType;

  /**
   * Value of the discount
   */
  @SerializedName("amount")
  private BigDecimal amount;

  /**
   * A discount rate calculated based on a proportion of the
   * balance. Note that the currency of the fee discount is
   * expected to be the same as the currency of the fee itself.
   * One of amount, balanceRate, transactionRate, accruedRate and
   * feeRate is mandatory. Unless noted in additionalInfo,
   * assumes the application and calculation frequency are the
   * same as the corresponding fee
   */
  @SerializedName("balanceRate")
  private BigDecimal balanceRate;

  /**
   * A discount rate calculated based on a proportion of a
   * transaction. Note that the currency of the fee discount is
   * expected to be the same as the currency of the fee itself.
   * One of amount, balanceRate, transactionRate, accruedRate and
   * feeRate is mandatory
   */
  @SerializedName("transactionRate")
  private BigDecimal transactionRate;

  /**
   * A discount rate calculated based on a proportion of the
   * calculated interest accrued on the account. Note that the
   * currency of the fee discount is expected to be the same as
   * the currency of the fee itself. One of amount, balanceRate,
   * transactionRate, accruedRate and feeRate is mandatory.
   * Unless noted in additionalInfo, assumes the application and
   * calculation frequency are the same as the corresponding fee
   */
  @SerializedName("accruedRate")
  private BigDecimal accruedRate;

  /**
   * A discount rate calculated based on a proportion of the fee
   * to which this discount is attached. Note that the currency
   * of the fee discount is expected to be the same as the
   * currency of the fee itself. One of amount, balanceRate,
   * transactionRate, accruedRate and feeRate is mandatory.
   * Unless noted in additionalInfo, assumes the application and
   * calculation frequency are the same as the corresponding fee
   */
  @SerializedName("feeRate")
  private BigDecimal feeRate;

  /**
   * Generic field containing additional information relevant to
   * the discountType specified. Whether mandatory or not is
   * dependent on the value of discountType
   */
  @SerializedName("additionalValue")
  private String additionalValue;

  /**
   * Display text providing more information on the discount
   */
  @SerializedName("additionalInfo")
  private String additionalInfo;

  /**
   * Link to a web page with more information on this discount
   */
  @SerializedName("additionalInfoUri")
  private String additionalInfoUri;

  /**
   * Eligibility constraints that apply to this discount
   */
  @SerializedName("eligibility")
  private List<BankingProductDiscountEligibility> eligibility;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BankingProductDiscount description(String description) {
    this.description = description;
    return this;
  }

  public DiscountType getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountType discountType) {
    this.discountType = discountType;
  }

  public BankingProductDiscount discountType(DiscountType discountType) {
    this.discountType = discountType;
    return this;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BankingProductDiscount amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public BigDecimal getBalanceRate() {
    return balanceRate;
  }

  public void setBalanceRate(BigDecimal balanceRate) {
    this.balanceRate = balanceRate;
  }

  public BankingProductDiscount balanceRate(BigDecimal balanceRate) {
    this.balanceRate = balanceRate;
    return this;
  }

  public BigDecimal getTransactionRate() {
    return transactionRate;
  }

  public void setTransactionRate(BigDecimal transactionRate) {
    this.transactionRate = transactionRate;
  }

  public BankingProductDiscount transactionRate(BigDecimal transactionRate) {
    this.transactionRate = transactionRate;
    return this;
  }

  public BigDecimal getAccruedRate() {
    return accruedRate;
  }

  public void setAccruedRate(BigDecimal accruedRate) {
    this.accruedRate = accruedRate;
  }

  public BankingProductDiscount accruedRate(BigDecimal accruedRate) {
    this.accruedRate = accruedRate;
    return this;
  }

  public BigDecimal getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(BigDecimal feeRate) {
    this.feeRate = feeRate;
  }

  public BankingProductDiscount feeRate(BigDecimal feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public BankingProductDiscount additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductDiscount additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public BankingProductDiscount additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  public List<BankingProductDiscountEligibility> getEligibility() {
    return eligibility;
  }

  public void setEligibility(List<BankingProductDiscountEligibility> eligibility) {
    this.eligibility = eligibility;
  }

  public BankingProductDiscount eligibility(List<BankingProductDiscountEligibility> eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    BankingProductDiscount inputModel = (BankingProductDiscount) o;
    if (!(description.equals(inputModel.getDescription()))) {
      return false;
    }
    if (!(discountType.equals(inputModel.getDiscountType()))) {
      return false;
    }
    if (!(amount.equals(inputModel.getAmount()))) {
      return false;
    }
    if (!(balanceRate.equals(inputModel.getBalanceRate()))) {
      return false;
    }
    if (!(transactionRate.equals(inputModel.getTransactionRate()))) {
      return false;
    }
    if (!(accruedRate.equals(inputModel.getAccruedRate()))) {
      return false;
    }
    if (!(feeRate.equals(inputModel.getFeeRate()))) {
      return false;
    }
    if (!(additionalValue.equals(inputModel.getAdditionalValue()))) {
      return false;
    }
    if (!(additionalInfo.equals(inputModel.getAdditionalInfo()))) {
      return false;
    }
    if (!(additionalInfoUri.equals(inputModel.getAdditionalInfoUri()))) {
      return false;
    }
    if (!(eligibility.equals(inputModel.getEligibility()))) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eligibility,
        eligibility,
        eligibility,
        eligibility,
        eligibility,
        eligibility,
        eligibility,
        eligibility,
        eligibility,
        eligibility,
        eligibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("class %s {\n", getClass()));
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceRate: ").append(toIndentedString(balanceRate)).append("\n");
    sb.append("    transactionRate: ").append(toIndentedString(transactionRate)).append("\n");
    sb.append("    accruedRate: ").append(toIndentedString(accruedRate)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /** DiscountType */
  @JsonAdapter(DiscountType.Adapter.class)
  public enum DiscountType {
    BALANCE("BALANCE"),
    DEPOSITS("DEPOSITS"),
    PAYMENTS("PAYMENTS"),
    FEE_CAP("FEE_CAP"),
    ELIGIBILITY_ONLY("ELIGIBILITY_ONLY");

    private String value;

    DiscountType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public String getValue() {
      return value;
    }

    public static DiscountType fromValue(String value) {
      for (DiscountType b : DiscountType.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DiscountType> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiscountType enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiscountType read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DiscountType.fromValue(value);
      }
    }
  }
}
