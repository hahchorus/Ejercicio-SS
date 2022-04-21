//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.20 a las 07:58:02 PM CDT 
//


package https.t4is_uv_mx.inventario;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="inventario" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "inventario"
})
@XmlRootElement(name = "BuscarProductoResponse")
public class BuscarProductoResponse {

    @XmlElement(required = true)
    protected List<BuscarProductoResponse.Inventario> inventario;

    /**
     * Gets the value of the inventario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscarProductoResponse.Inventario }
     * 
     * 
     */
    public List<BuscarProductoResponse.Inventario> getInventario() {
        if (inventario == null) {
            inventario = new ArrayList<BuscarProductoResponse.Inventario>();
        }
        return this.inventario;
    }


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
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "nombre",
        "codigo",
        "cantidad",
        "costo",
        "descripcion",
        "activo"
    })
    public static class Inventario {

        protected int id;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String codigo;
        @XmlElement(required = true)
        protected String cantidad;
        @XmlElement(required = true)
        protected String costo;
        @XmlElement(required = true)
        protected String descripcion;
        @XmlElement(required = true)
        protected String activo;

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
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCantidad() {
            return cantidad;
        }

        /**
         * Define el valor de la propiedad cantidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCantidad(String value) {
            this.cantidad = value;
        }

        /**
         * Obtiene el valor de la propiedad costo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCosto() {
            return costo;
        }

        /**
         * Define el valor de la propiedad costo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCosto(String value) {
            this.costo = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad activo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivo() {
            return activo;
        }

        /**
         * Define el valor de la propiedad activo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivo(String value) {
            this.activo = value;
        }

    }

}
