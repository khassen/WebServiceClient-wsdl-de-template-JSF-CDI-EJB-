
package fr.treeptik.clientservice.wsimport;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ManagerWebServiceService", targetNamespace = "http://impl.webservice.treeptik.fr/", wsdlLocation = "http://localhost:8080/template-JSF-CDI-EJB/ManagerWebService?wsdl")
public class ManagerWebServiceService
    extends Service
{

    private final static URL MANAGERWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MANAGERWEBSERVICESERVICE_EXCEPTION;
    private final static QName MANAGERWEBSERVICESERVICE_QNAME = new QName("http://impl.webservice.treeptik.fr/", "ManagerWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/template-JSF-CDI-EJB/ManagerWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MANAGERWEBSERVICESERVICE_WSDL_LOCATION = url;
        MANAGERWEBSERVICESERVICE_EXCEPTION = e;
    }

    public ManagerWebServiceService() {
        super(__getWsdlLocation(), MANAGERWEBSERVICESERVICE_QNAME);
    }

    public ManagerWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MANAGERWEBSERVICESERVICE_QNAME, features);
    }

    public ManagerWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MANAGERWEBSERVICESERVICE_QNAME);
    }

    public ManagerWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MANAGERWEBSERVICESERVICE_QNAME, features);
    }

    public ManagerWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManagerWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ManagerWebService
     */
    @WebEndpoint(name = "ManagerWebServicePort")
    public ManagerWebService getManagerWebServicePort() {
        return super.getPort(new QName("http://impl.webservice.treeptik.fr/", "ManagerWebServicePort"), ManagerWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManagerWebService
     */
    @WebEndpoint(name = "ManagerWebServicePort")
    public ManagerWebService getManagerWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.webservice.treeptik.fr/", "ManagerWebServicePort"), ManagerWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANAGERWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MANAGERWEBSERVICESERVICE_EXCEPTION;
        }
        return MANAGERWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
