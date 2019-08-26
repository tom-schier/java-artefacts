/*
* Consumer Data Standards
* Sample Data Holder to Demonstrate the Consumer Data Right APIs
*
* NOTE: This class is auto generated by the cds-codegen package
* https://github.com/ConsumerDataStandardsAustralia/cds-codegen
* Do not edit the class manually.
*/
package au.org.consumerdatastandards.client.cli.support;

public class ApiClientOptions {

    private String serverUrl;
    private String discoveryUrl;
    private boolean verifyConformance = false;
    private String userAgent;
    private Boolean debugEnabled = false;

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    public void setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
    }

    public boolean isVerifyConformance() {
        return verifyConformance;
    }

    public void setVerifyConformance(boolean verifyConformance) {
        this.verifyConformance = verifyConformance;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Boolean getDebugEnabled() {
        return debugEnabled;
    }

    public void setDebugEnabled(Boolean debugEnabled) {
        this.debugEnabled = debugEnabled;
    }

}
