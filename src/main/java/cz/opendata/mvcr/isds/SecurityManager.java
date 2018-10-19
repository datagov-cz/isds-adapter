package cz.opendata.mvcr.isds;

import com.sun.xml.ws.developer.JAXWSProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.xml.ws.BindingProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class SecurityManager {

    private static final Logger LOG =
            LoggerFactory.getLogger(SecurityManager.class);

    private final String username;

    private final String password;

    private final SSLSocketFactory socketFactory;

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
        List<X509Certificate> certificates = new ArrayList<>();
        CertificateFactory certificateFactory =
                CertificateFactory.getInstance("X.509");
        LOG.info("Loading certificate:");
        File[] files = directory.listFiles();
        if (files == null) {
            throw new RuntimeException(
                    "Missing certificates directory: " + directory);
        }
        for (File file : files) {
            try (InputStream stream = new FileInputStream(file)) {
                X509Certificate cert = readCertificate(
                        certificateFactory, stream);
                LOG.info("    {} -> {}", file, cert.getIssuerDN().getName());
                certificates.add(cert);
            }
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int counter = 0;
        for (X509Certificate certificate : certificates) {
            keyStore.setCertificateEntry(
                    String.valueOf(counter++), certificate);
        }
        return keyStore;
    }


    private X509Certificate readCertificate(
            CertificateFactory certificateFactory, InputStream stream)
            throws CertificateException {
        Certificate cert = certificateFactory.generateCertificate(stream);
        return (X509Certificate) cert;
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
