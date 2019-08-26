/*
* Consumer Data Standards
* Sample Data Holder to Demonstrate the Consumer Data Right APIs
*
* NOTE: This class is auto generated by the cds-codegen package
* https://github.com/ConsumerDataStandardsAustralia/cds-codegen
* Do not edit the class manually.
*/
package au.org.consumerdatastandards.client.cli;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import au.org.consumerdatastandards.client.cli.support.ApiClientOptions;

@ShellComponent
@ShellCommandGroup("Common Functions")
public class Common {
    
    @Autowired
    ApiClientOptions apiClientOptions;
    
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(Common.class);

    @ShellMethod("Set CDS server URL, e.g. http://data.holder/cds-au/v1")
    public void server(@ShellOption String url) {
        apiClientOptions.setServerUrl(url);
        LOG.info("Server URL is set to {}", apiClientOptions.getServerUrl());
    }
    
    @ShellMethod("Setup minimum log level, default is INFO")
    public void setLogLevel(@ShellOption Level targetLevel) {
        Logger root = (Logger)LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        root.setLevel(targetLevel);
    }
    
    @ShellMethod("Retrieve current minimum log level")
    public void getLogLevel() {
        Logger root = (Logger)LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        Level currentLevel = root.getLevel();
        root.setLevel(Level.INFO);
        // Need to make sure we are at least at info or the message won't print
        LOG.info("Log level currently set to: {}", currentLevel);
        root.setLevel(currentLevel);
    }
    
    @ShellMethod("Set browser user-agent")
    public void setUserAgent(@ShellOption String userAgent) {
        apiClientOptions.setUserAgent(userAgent);
    }
    
    @ShellMethod("Get browser user-agent")
    public void getUserAgent() {
        Logger root = (Logger)LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.INFO);
        LOG.info("User Agent currently set to: {}", apiClientOptions.getUserAgent());
    }
    
    @ShellMethod("Enable client debugging")
    public void clientDebugEnable(@ShellOption String clientEnable) {
        apiClientOptions.setDebugEnabled(Boolean.parseBoolean(clientEnable));
    }
    
    @ShellMethod("Client debug enabled")
    public void getClientDebug() {
        Logger root = (Logger)LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.INFO);
        LOG.info("Client debug is currently set to: {}", apiClientOptions.getDebugEnabled());
    }
}


