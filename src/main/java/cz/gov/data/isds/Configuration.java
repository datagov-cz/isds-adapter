package cz.gov.data.isds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class Configuration {

    private static final Logger LOG =
            LoggerFactory.getLogger(Configuration.class);

    private String login;

    private String password;

    private String url;

    private String outputMessages;

    private String outputAttachments;

    private String certificatesDirectory;

    private int downloadInterval;

    public Configuration() throws IOException {
        String configurationPath = System.getProperty("configurationFile");
        if (configurationPath == null) {
            configurationPath = "./configuration.properties";
        }
        LOG.info("Reading configuration file: {}", configurationPath);
        loadFromFile(new File(configurationPath));
    }

    private void loadFromFile(File file) throws IOException {
        Properties properties = new Properties();
        try (InputStream stream = new FileInputStream(file)) {
            properties.load(stream);
        }
        //
        this.login = getEnvOrProperty(properties, "login", "ISDS_LOGIN");
        this.password = getEnvOrProperty(properties, "password", "ISDS_PASSWORD");
        this.url = getEnvOrProperty(properties, "url", "ISDS_URL");
        //
        this.outputMessages = getProperty(properties, "output.messages");
        this.outputAttachments = getProperty(properties, "output.attachments");
        this.certificatesDirectory = getProperty(properties, "certificates");
        this.downloadInterval = Integer.parseInt(
                getProperty(properties, "download_interval_in_minutes"));
    }

    private String getEnvOrProperty(
            Properties properties, String property, String environment) {
        String environmentValue = System.getenv(environment);
        if ("".equals(environmentValue)) {
            return environmentValue;
        }
        return getProperty(properties, property);
    }

    private String getProperty(Properties properties, String name) {
        final String value;
        try {
            value = properties.getProperty(name);
        } catch (RuntimeException ex) {
            LOG.error("Invalid configuration property: '{}'", name);
            throw ex;
        }
        if (value == null) {
            LOG.error("Missing configuration property: '{}'", name);
            throw new RuntimeException("Missing configuration property!");
        } else {
            return value;
        }
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUrl() {
        return this.url;
    }

    public String getOutputMessages() {
        return this.outputMessages;
    }

    public String getOutputAttachments() {
        return this.outputAttachments;
    }

    public String getCertificatesDirectory() {
        return this.certificatesDirectory;
    }

    public int getDownloadInterval() {
        return downloadInterval;
    }

}
