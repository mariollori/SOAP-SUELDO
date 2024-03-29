
package pe.PagoBruto;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PagoBrutoImpService", targetNamespace = "http://PagoBruto.pe/", wsdlLocation = "http://localhost:2121/PagoBruto?wsdl")
public class PagoBrutoImpService
    extends Service
{

    private final static URL PAGOBRUTOIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException PAGOBRUTOIMPSERVICE_EXCEPTION;
    private final static QName PAGOBRUTOIMPSERVICE_QNAME = new QName("http://PagoBruto.pe/", "PagoBrutoImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2121/PagoBruto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PAGOBRUTOIMPSERVICE_WSDL_LOCATION = url;
        PAGOBRUTOIMPSERVICE_EXCEPTION = e;
    }

    public PagoBrutoImpService() {
        super(__getWsdlLocation(), PAGOBRUTOIMPSERVICE_QNAME);
    }

    public PagoBrutoImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PAGOBRUTOIMPSERVICE_QNAME, features);
    }

    public PagoBrutoImpService(URL wsdlLocation) {
        super(wsdlLocation, PAGOBRUTOIMPSERVICE_QNAME);
    }

    public PagoBrutoImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PAGOBRUTOIMPSERVICE_QNAME, features);
    }

    public PagoBrutoImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PagoBrutoImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PagoBrutoDao
     */
    @WebEndpoint(name = "PagoBrutoImpPort")
    public PagoBrutoDao getPagoBrutoImpPort() {
        return super.getPort(new QName("http://PagoBruto.pe/", "PagoBrutoImpPort"), PagoBrutoDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PagoBrutoDao
     */
    @WebEndpoint(name = "PagoBrutoImpPort")
    public PagoBrutoDao getPagoBrutoImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://PagoBruto.pe/", "PagoBrutoImpPort"), PagoBrutoDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PAGOBRUTOIMPSERVICE_EXCEPTION!= null) {
            throw PAGOBRUTOIMPSERVICE_EXCEPTION;
        }
        return PAGOBRUTOIMPSERVICE_WSDL_LOCATION;
    }

}
