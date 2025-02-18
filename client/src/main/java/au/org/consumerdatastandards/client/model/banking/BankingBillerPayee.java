/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingBillerPayee {

    private String billerCode;

    private String crn;

    private String billerName;

    /**
     * BPAY Biller Code of the Biller
     * @return billerCode
     */
    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    /**
     * BPAY CRN of the Biller (if available).<br>Where the CRN contains sensitive information, it should be masked in line with how the Data Holder currently displays account identifiers in their existing online banking channels. If the contents of the CRN match the format of a Credit Card PAN they should be masked according to the rules applicable for MaskedPANString. If the contents are are otherwise sensitive, then it should be masked using the rules applicable for the MaskedAccountString common type.
     * @return crn
     */
    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    /**
     * Name of the Biller
     * @return billerName
     */
    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingBillerPayee bankingBillerPayee = (BankingBillerPayee) o;
        return Objects.equals(this.billerCode, bankingBillerPayee.billerCode) &&
            Objects.equals(this.crn, bankingBillerPayee.crn) &&
            Objects.equals(this.billerName, bankingBillerPayee.billerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            billerCode,
            crn,
            billerName);
    }

    @Override
    public String toString() {
        return "class BankingBillerPayee {\n" +
            "   billerCode: " + toIndentedString(billerCode) + "\n" + 
            "   crn: " + toIndentedString(crn) + "\n" + 
            "   billerName: " + toIndentedString(billerName) + "\n" + 
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
