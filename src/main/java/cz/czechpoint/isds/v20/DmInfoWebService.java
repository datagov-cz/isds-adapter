
package cz.czechpoint.isds.v20;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/3.0.2 (RELEASE-3.0.2-4d220c5; 2021-08-02T05:18:16+0000) JAXWS-RI/3.0.2 JAXWS-API/3.0.1 JAXB-RI/3.0.2 JAXB-API/${jaxb-api.version}
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "dmInfoWebService", targetNamespace = "http://isds.czechpoint.cz/v20", wsdlLocation = "file:/D:/Projects/mvcr/nkod-isds/src/main/resources/wsdl/dm_info.wsdl")
public class DmInfoWebService
    extends Service
{

    private final static URL DMINFOWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DMINFOWEBSERVICE_EXCEPTION;
    private final static QName DMINFOWEBSERVICE_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmInfoWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Projects/mvcr/nkod-isds/src/main/resources/wsdl/dm_info.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DMINFOWEBSERVICE_WSDL_LOCATION = url;
        DMINFOWEBSERVICE_EXCEPTION = e;
    }

    public DmInfoWebService() {
        super(__getWsdlLocation(), DMINFOWEBSERVICE_QNAME);
    }

    public DmInfoWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DMINFOWEBSERVICE_QNAME, features);
    }

    public DmInfoWebService(URL wsdlLocation) {
        super(wsdlLocation, DMINFOWEBSERVICE_QNAME);
    }

    public DmInfoWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DMINFOWEBSERVICE_QNAME, features);
    }

    public DmInfoWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DmInfoWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DmInfoPortType
     */
    @WebEndpoint(name = "dmInfoPortType")
    public DmInfoPortType getDmInfoPortType() {
        return super.getPort(new QName("http://isds.czechpoint.cz/v20", "dmInfoPortType"), DmInfoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DmInfoPortType
     */
    @WebEndpoint(name = "dmInfoPortType")
    public DmInfoPortType getDmInfoPortType(WebServiceFeature... features) {
        return super.getPort(new QName("http://isds.czechpoint.cz/v20", "dmInfoPortType"), DmInfoPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DMINFOWEBSERVICE_EXCEPTION!= null) {
            throw DMINFOWEBSERVICE_EXCEPTION;
        }
        return DMINFOWEBSERVICE_WSDL_LOCATION;
    }

}
