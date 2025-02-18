package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * EnergyBillingTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-01-11T14:03:27.755+11:00[Australia/Sydney]")
public class EnergyBillingTransaction {
    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("executionDateTime")
    private String executionDateTime;

    @JsonProperty("gst")
    private String gst;

    /**
     * Indicator of the type of transaction object present in this record
     */
    public enum TransactionUTypeEnum {
        USAGE("usage"),

        DEMAND("demand"),

        ONCEOFF("onceOff"),

        OTHERCHARGES("otherCharges"),

        PAYMENT("payment");

        private String value;

        TransactionUTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TransactionUTypeEnum fromValue(String value) {
            for (TransactionUTypeEnum b : TransactionUTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("transactionUType")
    private TransactionUTypeEnum transactionUType;

    @JsonProperty("usage")
    private EnergyBillingUsageTransaction usage;

    @JsonProperty("demand")
    private EnergyBillingDemandTransaction demand;

    @JsonProperty("onceOff")
    private EnergyBillingOnceOffTransaction onceOff;

    @JsonProperty("otherCharges")
    private EnergyBillingOtherTransaction otherCharges;

    @JsonProperty("payment")
    private EnergyBillingPaymentTransaction payment;

    public EnergyBillingTransaction accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The ID of the account for which transaction applies
     *
     * @return accountId
     */
    @ApiModelProperty(required = true,
            value = "The ID of the account for which transaction applies")
    @NotNull


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public EnergyBillingTransaction executionDateTime(String executionDateTime) {
        this.executionDateTime = executionDateTime;
        return this;
    }

    /**
     * The date and time that the transaction occurred
     *
     * @return executionDateTime
     */
    @ApiModelProperty(required = true,
            value = "The date and time that the transaction occurred")
    @NotNull


    public String getExecutionDateTime() {
        return executionDateTime;
    }

    public void setExecutionDateTime(String executionDateTime) {
        this.executionDateTime = executionDateTime;
    }

    public EnergyBillingTransaction gst(String gst) {
        this.gst = gst;
        return this;
    }

    /**
     * The GST incurred in the transaction.  Should not be included for credits or payments.  If absent zero is assumed
     *
     * @return gst
     */
    @ApiModelProperty(value = "The GST incurred in the transaction.  Should not be included for credits or payments.  If absent zero is assumed")


    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public EnergyBillingTransaction transactionUType(TransactionUTypeEnum transactionUType) {
        this.transactionUType = transactionUType;
        return this;
    }

    /**
     * Indicator of the type of transaction object present in this record
     *
     * @return transactionUType
     */
    @ApiModelProperty(required = true,
            value = "Indicator of the type of transaction object present in this record")
    @NotNull


    public TransactionUTypeEnum getTransactionUType() {
        return transactionUType;
    }

    public void setTransactionUType(TransactionUTypeEnum transactionUType) {
        this.transactionUType = transactionUType;
    }

    public EnergyBillingTransaction usage(EnergyBillingUsageTransaction usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @ApiModelProperty(value = "")

    @Valid

    public EnergyBillingUsageTransaction getUsage() {
        return usage;
    }

    public void setUsage(EnergyBillingUsageTransaction usage) {
        this.usage = usage;
    }

    public EnergyBillingTransaction demand(EnergyBillingDemandTransaction demand) {
        this.demand = demand;
        return this;
    }

    /**
     * Get demand
     *
     * @return demand
     */
    @ApiModelProperty(value = "")

    @Valid

    public EnergyBillingDemandTransaction getDemand() {
        return demand;
    }

    public void setDemand(EnergyBillingDemandTransaction demand) {
        this.demand = demand;
    }

    public EnergyBillingTransaction onceOff(EnergyBillingOnceOffTransaction onceOff) {
        this.onceOff = onceOff;
        return this;
    }

    /**
     * Get onceOff
     *
     * @return onceOff
     */
    @ApiModelProperty(value = "")

    @Valid

    public EnergyBillingOnceOffTransaction getOnceOff() {
        return onceOff;
    }

    public void setOnceOff(EnergyBillingOnceOffTransaction onceOff) {
        this.onceOff = onceOff;
    }

    public EnergyBillingTransaction otherCharges(EnergyBillingOtherTransaction otherCharges) {
        this.otherCharges = otherCharges;
        return this;
    }

    /**
     * Get otherCharges
     *
     * @return otherCharges
     */
    @ApiModelProperty(value = "")

    @Valid

    public EnergyBillingOtherTransaction getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(EnergyBillingOtherTransaction otherCharges) {
        this.otherCharges = otherCharges;
    }

    public EnergyBillingTransaction payment(EnergyBillingPaymentTransaction payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Get payment
     *
     * @return payment
     */
    @ApiModelProperty(value = "")

    @Valid

    public EnergyBillingPaymentTransaction getPayment() {
        return payment;
    }

    public void setPayment(EnergyBillingPaymentTransaction payment) {
        this.payment = payment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyBillingTransaction energyBillingTransaction = (EnergyBillingTransaction) o;
        return Objects.equals(this.accountId, energyBillingTransaction.accountId) &&
                Objects.equals(this.executionDateTime, energyBillingTransaction.executionDateTime) &&
                Objects.equals(this.gst, energyBillingTransaction.gst) &&
                Objects.equals(this.transactionUType, energyBillingTransaction.transactionUType) &&
                Objects.equals(this.usage, energyBillingTransaction.usage) &&
                Objects.equals(this.demand, energyBillingTransaction.demand) &&
                Objects.equals(this.onceOff, energyBillingTransaction.onceOff) &&
                Objects.equals(this.otherCharges, energyBillingTransaction.otherCharges) &&
                Objects.equals(this.payment, energyBillingTransaction.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, executionDateTime, gst, transactionUType, usage, demand, onceOff, otherCharges, payment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyBillingTransaction {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    executionDateTime: ").append(toIndentedString(executionDateTime)).append("\n");
        sb.append("    gst: ").append(toIndentedString(gst)).append("\n");
        sb.append("    transactionUType: ").append(toIndentedString(transactionUType)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    demand: ").append(toIndentedString(demand)).append("\n");
        sb.append("    onceOff: ").append(toIndentedString(onceOff)).append("\n");
        sb.append("    otherCharges: ").append(toIndentedString(otherCharges)).append("\n");
        sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
        sb.append("}");
        return sb.toString();
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

