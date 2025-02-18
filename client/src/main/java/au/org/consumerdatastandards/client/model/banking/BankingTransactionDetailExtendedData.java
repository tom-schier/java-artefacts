/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingTransactionDetailExtendedData {

    public enum ExtensionUType {
        X2P101PAYLOAD
    }

    public enum Service {
        X2P1_01("X2P1.01");

        private String value;

        Service(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private ExtensionUType extensionUType;

    private String payee;

    private String payer;

    private BankingTransactionDetailExtendedDataX2p101Payload x2p101Payload;

    private Service service;

    /**
     * Label of the originating payer. Mandatory for inbound payment
     * @return payer
     */
    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    /**
     * Label of the target PayID.  Mandatory for an outbound payment. The name assigned to the BSB/Account Number or PayID (by the owner of the PayID)
     * @return payee
     */
    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    /**
     * Optional extended data provided specific to transaction originated via NPP
     * @return extensionUType
     */
    public ExtensionUType getExtensionUType() {
        return extensionUType;
    }

    public void setExtensionUType(ExtensionUType extensionUType) {
        this.extensionUType = extensionUType;
    }

    /**
     * Get x2p101Payload
     * @return x2p101Payload
     */
    public BankingTransactionDetailExtendedDataX2p101Payload getX2p101Payload() {
        return x2p101Payload;
    }

    public void setX2p101Payload(BankingTransactionDetailExtendedDataX2p101Payload x2p101Payload) {
        this.x2p101Payload = x2p101Payload;
    }

    /**
     * Identifier of the applicable overlay service. Valid values are: X2P1.01
     * @return service
     */
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingTransactionDetailExtendedData bankingTransactionDetailExtendedData = (BankingTransactionDetailExtendedData) o;
        return Objects.equals(this.payer, bankingTransactionDetailExtendedData.payer) &&
            Objects.equals(this.payee, bankingTransactionDetailExtendedData.payee) &&
            Objects.equals(this.extensionUType, bankingTransactionDetailExtendedData.extensionUType) &&
            Objects.equals(this.x2p101Payload, bankingTransactionDetailExtendedData.x2p101Payload) &&
            Objects.equals(this.service, bankingTransactionDetailExtendedData.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            payer,
            payee,
            extensionUType,
            x2p101Payload,
            service);
    }

    @Override
    public String toString() {
        return "class BankingTransactionDetailExtendedData {\n" +
            "   payer: " + toIndentedString(payer) + "\n" +
            "   payee: " + toIndentedString(payee) + "\n" +
            "   extensionUType: " + toIndentedString(extensionUType) + "\n" +
            "   x2p101Payload: " + toIndentedString(x2p101Payload) + "\n" +
            "   service: " + toIndentedString(service) + "\n" +
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
