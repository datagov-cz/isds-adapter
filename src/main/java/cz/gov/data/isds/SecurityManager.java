package cz.gov.data.isds;

import com.sun.xml.ws.developer.JAXWSProperties;
import jakarta.xml.ws.BindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.*;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;

class SecurityManager {

    private static final Logger LOG =
            LoggerFactory.getLogger(SecurityManager.class);

    private final String username;

    private final String password;

    private final SSLSocketFactory socketFactory;

    private final CertificateFactory x509Factory =
            CertificateFactory.getInstance("X.509");

    public SecurityManager(
            String username, String password, String certificatesDirectory)
            throws Exception {
        this.username = username;
        this.password = password;
        this.socketFactory = createSslSocketFactory(
                new File(certificatesDirectory));
    }

    private SSLSocketFactory createSslSocketFactory(File directory)
            throws Exception {
        String algorithm = TrustManagerFactory.getDefaultAlgorithm();
        TrustManagerFactory trustManagerFactory =
                TrustManagerFactory.getInstance(algorithm);
        trustManagerFactory.init(createKeyStore(directory));
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(
                null,
                trustManagerFactory.getTrustManagers(),
                new SecureRandom());
        return context.getSocketFactory();
    }

    private KeyStore createKeyStore(File directory) throws Exception {
        // Create keystore with the certificates.
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        loadKeyStore(keyStore);
        addCertificatesFromDirectory(keyStore, directory);
        return keyStore;
    }

    /**
     * Add certificates from Java distribution.
     */
    private void loadKeyStore(KeyStore keyStore) throws Exception {
        String trustStorePath = System.getProperty("javax.net.ssl.trustStore");
        // 'changeit' is a default password.
        String trustStorePassword = System.getProperty(
                "javax.net.ssl.trustStorePassword", "changeit");
        if (trustStorePath != null) {
            try (InputStream stream = new FileInputStream(trustStorePath)) {
                keyStore.load(stream, trustStorePassword.toCharArray());
            }
        }
        // Load java certificates.
        File javaStorePath = new File(
                System.getProperty("java.home"), "lib/security/cacerts");
        if (javaStorePath.exists()) {
            // 'changeit' is a default password.
            String password = "changeit";
            try (InputStream stream = new FileInputStream(javaStorePath)) {
                keyStore.load(stream, password.toCharArray());
            }
            return;
        }
        // Just use empty store.
        keyStore.load(null, null);
    }

    private void addCertificatesFromDirectory(
            KeyStore keyStore, File directory) throws Exception {
        if (directory == null || !directory.isDirectory()) {
            return;
        }
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }
        int counter = 0;
        for (File file : files) {
            // Load and add a certificate.
            try (InputStream stream = new FileInputStream(file)) {
                X509Certificate certificate =  (X509Certificate)
                        x509Factory.generateCertificate(stream);
                keyStore.setCertificateEntry(
                        "extra-"+counter++, certificate);
            }
        }
    }

    public void bindService(BindingProvider provider, String uri) {
        provider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, uri);
        provider.getRequestContext().put(
                JAXWSProperties.SSL_SOCKET_FACTORY, this.socketFactory);
        // Set security credentials.
        Map<String, Object> requestContext = provider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, this.username);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, this.password);
    }

}
