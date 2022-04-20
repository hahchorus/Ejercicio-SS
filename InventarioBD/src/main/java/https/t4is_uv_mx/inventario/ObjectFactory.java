//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.20 a las 02:11:25 PM CDT 
//


package https.t4is_uv_mx.inventario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.inventario package. 
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

    private final static QName _BuscarProductoRequest_QNAME = new QName("https://t4is.uv.mx/inventario", "BuscarProductoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.inventario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarProductoResponse }
     * 
     */
    public BuscarProductoResponse createBuscarProductoResponse() {
        return new BuscarProductoResponse();
    }

    /**
     * Create an instance of {@link RegistrarProductoRequest }
     * 
     */
    public RegistrarProductoRequest createRegistrarProductoRequest() {
        return new RegistrarProductoRequest();
    }

    /**
     * Create an instance of {@link RegistrarProductoResponse }
     * 
     */
    public RegistrarProductoResponse createRegistrarProductoResponse() {
        return new RegistrarProductoResponse();
    }

    /**
     * Create an instance of {@link BuscarProductoResponse.Inventario }
     * 
     */
    public BuscarProductoResponse.Inventario createBuscarProductoResponseInventario() {
        return new BuscarProductoResponse.Inventario();
    }

    /**
     * Create an instance of {@link ModificarProductoRequest }
     * 
     */
    public ModificarProductoRequest createModificarProductoRequest() {
        return new ModificarProductoRequest();
    }

    /**
     * Create an instance of {@link ModificarProductoResponse }
     * 
     */
    public ModificarProductoResponse createModificarProductoResponse() {
        return new ModificarProductoResponse();
    }

    /**
     * Create an instance of {@link BorrarProductoRequest }
     * 
     */
    public BorrarProductoRequest createBorrarProductoRequest() {
        return new BorrarProductoRequest();
    }

    /**
     * Create an instance of {@link BorrarProductoResponse }
     * 
     */
    public BorrarProductoResponse createBorrarProductoResponse() {
        return new BorrarProductoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/inventario", name = "BuscarProductoRequest")
    public JAXBElement<Object> createBuscarProductoRequest(Object value) {
        return new JAXBElement<Object>(_BuscarProductoRequest_QNAME, Object.class, null, value);
    }

}
