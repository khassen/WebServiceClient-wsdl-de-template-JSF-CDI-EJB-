
package fr.treeptik.clientservice.wsimport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ManagerWebService", targetNamespace = "http://impl.webservice.treeptik.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ManagerWebService {


    /**
     * 
     * @param arg0
     * @throws ServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "register", targetNamespace = "http://impl.webservice.treeptik.fr/", className = "fr.treeptik.clientservice.wsimport.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://impl.webservice.treeptik.fr/", className = "fr.treeptik.clientservice.wsimport.RegisterResponse")
    public void register(
        @WebParam(name = "arg0", targetNamespace = "")
        Employe arg0)
        throws ServiceException_Exception
    ;

}
