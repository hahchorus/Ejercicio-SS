//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.20 a las 02:11:25 PM CDT 
//


package https.t4is_uv_mx.inventario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rnombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rcodigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rcantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rcosto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rdescripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ractivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rnombre",
    "rcodigo",
    "rcantidad",
    "rcosto",
    "rdescripcion",
    "ractivo"
})
@XmlRootElement(name = "RegistrarProductoResponse")
public class RegistrarProductoResponse {

    @XmlElement(required = true)
    protected String rnombre;
    @XmlElement(required = true)
    protected String rcodigo;
    @XmlElement(required = true)
    protected String rcantidad;
    @XmlElement(required = true)
    protected String rcosto;
    @XmlElement(required = true)
    protected String rdescripcion;
    @XmlElement(required = true)
    protected String ractivo;

    /**
     * Obtiene el valor de la propiedad rnombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnombre() {
        return rnombre;
    }

    /**
     * Define el valor de la propiedad rnombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnombre(String value) {
        this.rnombre = value;
    }

    /**
     * Obtiene el valor de la propiedad rcodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcodigo() {
        return rcodigo;
    }

    /**
     * Define el valor de la propiedad rcodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcodigo(String value) {
        this.rcodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad rcantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcantidad() {
        return rcantidad;
    }

    /**
     * Define el valor de la propiedad rcantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcantidad(String value) {
        this.rcantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad rcosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcosto() {
        return rcosto;
    }

    /**
     * Define el valor de la propiedad rcosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcosto(String value) {
        this.rcosto = value;
    }

    /**
     * Obtiene el valor de la propiedad rdescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdescripcion() {
        return rdescripcion;
    }

    /**
     * Define el valor de la propiedad rdescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdescripcion(String value) {
        this.rdescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad ractivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRactivo() {
        return ractivo;
    }

    /**
     * Define el valor de la propiedad ractivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRactivo(String value) {
        this.ractivo = value;
    }

}
