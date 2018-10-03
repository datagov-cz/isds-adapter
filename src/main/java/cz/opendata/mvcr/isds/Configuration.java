package cz.opendata.mvcr.isds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
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
        this.login = getProperty(properties, "login");
        this.password = getProperty(properties, "password");
        this.url = getProperty(properties, "url");
        this.outputMessages = getProperty(properties, "output.messages");
        this.outputAttachments = getProperty(properties, "output.attachments");
        this.certificatesDirectory = getProperty(properties, "certificates");
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
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getOutputMessages() {
        return outputMessages;
    }

    public String getOutputAttachments() {
        return outputAttachments;
    }

    public String getCertificatesDirectory() {
        return certificatesDirectory;
    }

}
