package mx.uv.t4is.InventarioBD;

public class Inventariox {

    private int id;
    private String nombre;
    private String codigo;
    private String cantidad;
    private String costo;
    private String descripcion;
    private String activo;
    
    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getActivo() {
        return activo;
    }
    
    public void setActivo(String activo) {
        this.activo = activo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getCosto() {
        return costo;
    }
    
    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    public String getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'"+
            ", nombre='" + getNombre() + "'"+
            ", codigo='" + getCodigo() + "'"+
            ", cantidad='" + getCantidad() + "'"+
            ", costo='" + getCosto() + "'"+
            ", descripcion='" + getDescripcion() + "'"+
            ", activo='" + getActivo() + "'"+
            "}";
    }

}
