
package pe.PagoBruto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.pagobruto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularpagototalResponse_QNAME = new QName("http://PagoBruto.pe/", "calcularpagototalResponse");
    private final static QName _Calcularpagototal_QNAME = new QName("http://PagoBruto.pe/", "calcularpagototal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.pagobruto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calcularpagototal }
     * 
     */
    public Calcularpagototal createCalcularpagototal() {
        return new Calcularpagototal();
    }

    /**
     * Create an instance of {@link CalcularpagototalResponse }
     * 
     */
    public CalcularpagototalResponse createCalcularpagototalResponse() {
        return new CalcularpagototalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularpagototalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PagoBruto.pe/", name = "calcularpagototalResponse")
    public JAXBElement<CalcularpagototalResponse> createCalcularpagototalResponse(CalcularpagototalResponse value) {
        return new JAXBElement<CalcularpagototalResponse>(_CalcularpagototalResponse_QNAME, CalcularpagototalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcularpagototal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PagoBruto.pe/", name = "calcularpagototal")
    public JAXBElement<Calcularpagototal> createCalcularpagototal(Calcularpagototal value) {
        return new JAXBElement<Calcularpagototal>(_Calcularpagototal_QNAME, Calcularpagototal.class, null, value);
    }

}
