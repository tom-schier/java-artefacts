/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import au.org.consumerdatastandards.client.model.banking.BaseResponse;

import java.util.Objects;

public class ResponseDiscoveryOutagesList extends BaseResponse {

    private ResponseDiscoveryOutagesListData data;

    /**
     * Get data
     * @return data
     */
    public ResponseDiscoveryOutagesListData getData() {
        return data;
    }

    public void setData(ResponseDiscoveryOutagesListData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseDiscoveryOutagesList responseDiscoveryOutagesList = (ResponseDiscoveryOutagesList) o;
        return Objects.equals(this.data, responseDiscoveryOutagesList.data) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class ResponseDiscoveryOutagesList {\n" +
            "   data: " + toIndentedString(data) + "\n" + 
            "   links: " + toIndentedString(getLinks()) + "\n" + 
            "   meta: " + toIndentedString(getMeta()) + "\n" + 
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
