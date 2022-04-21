//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.20 a las 07:58:02 PM CDT 
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nnombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ncodigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ncantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ncosto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ndescripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nactivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "id",
    "nnombre",
    "ncodigo",
    "ncantidad",
    "ncosto",
    "ndescripcion",
    "nactivo"
})
@XmlRootElement(name = "ModificarProductoRequest")
public class ModificarProductoRequest {

    protected int id;
    @XmlElement(required = true)
    protected String nnombre;
    @XmlElement(required = true)
    protected String ncodigo;
    @XmlElement(required = true)
    protected String ncantidad;
    @XmlElement(required = true)
    protected String ncosto;
    @XmlElement(required = true)
    protected String ndescripcion;
    @XmlElement(required = true)
    protected String nactivo;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nnombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNnombre() {
        return nnombre;
    }

    /**
     * Define el valor de la propiedad nnombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNnombre(String value) {
        this.nnombre = value;
    }

    /**
     * Obtiene el valor de la propiedad ncodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcodigo() {
        return ncodigo;
    }

    /**
     * Define el valor de la propiedad ncodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcodigo(String value) {
        this.ncodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad ncantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcantidad() {
        return ncantidad;
    }

    /**
     * Define el valor de la propiedad ncantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcantidad(String value) {
        this.ncantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad ncosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcosto() {
        return ncosto;
    }

    /**
     * Define el valor de la propiedad ncosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcosto(String value) {
        this.ncosto = value;
    }

    /**
     * Obtiene el valor de la propiedad ndescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdescripcion() {
        return ndescripcion;
    }

    /**
     * Define el valor de la propiedad ndescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdescripcion(String value) {
        this.ndescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad nactivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNactivo() {
        return nactivo;
    }

    /**
     * Define el valor de la propiedad nactivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNactivo(String value) {
        this.nactivo = value;
    }

}
