package mx.uv.t4is.InventarioBD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

//import https.t4is_uv_mx.inventario.BorrarProductoResponse;
import https.t4is_uv_mx.inventario.BuscarProductoResponse;
import https.t4is_uv_mx.inventario.ModificarProductoRequest;
import https.t4is_uv_mx.inventario.ModificarProductoResponse;
import https.t4is_uv_mx.inventario.RegistrarProductoRequest;
import https.t4is_uv_mx.inventario.RegistrarProductoResponse;

//Todos los @ son anotaciones
@Endpoint
public class InventarioEndPoint {

    //int contId = 1;
    //List<Inventario> lista = new ArrayList<>();

    @Autowired
    Iinventario iinventario;

    //Metodo para registrar un articulo en el inventario
    //El PayloadRoot es quien va a procipiar la solicitud
    //El namespace es el targetNamespace que se declaro en inventario.xsd
    @PayloadRoot(localPart = "RegistrarProductoRequest", namespace = "https://t4is.uv.mx/inventario")
    @ResponsePayload
    public RegistrarProductoResponse Registrar(@RequestPayload RegistrarProductoRequest peticion) {
        
        RegistrarProductoResponse respuesta = new RegistrarProductoResponse();
        respuesta.setRnombre(peticion.getNombre());
        respuesta.setRcodigo(peticion.getCodigo());
        respuesta.setRcantidad(peticion.getCantidad());
        respuesta.setRcosto(peticion.getCosto());
        respuesta.setRdescripcion(peticion.getDescripcion());
        respuesta.setRactivo(peticion.getActivo());

        Inventariox inventariox = new Inventariox();

        inventariox.setNombre(peticion.getNombre());
        inventariox.setCodigo(peticion.getCodigo());
        inventariox.setCantidad(peticion.getCantidad());
        inventariox.setCosto(peticion.getCosto());
        inventariox.setDescripcion(peticion.getDescripcion());
        inventariox.setActivo(peticion.getActivo());
        iinventario.save(inventariox);

        return respuesta;
    }

    @PayloadRoot(localPart = "BuscarProductoRequest", namespace = "https://t4is.uv.mx/inventario")
    @ResponsePayload
    public BuscarProductoResponse buscarproducto() {
        BuscarProductoResponse respuesta = new BuscarProductoResponse();

        Iterable<Inventariox> lista = iinventario.findAll();

        for (Inventariox o : lista) {
            BuscarProductoResponse.Inventario e = new BuscarProductoResponse.Inventario();
            e.setNombre(o.getNombre());
            e.setCodigo(o.getCodigo());
            e.setCantidad(o.getCantidad());
            e.setCosto(o.getCosto());
            e.setDescripcion(o.getDescripcion());
            e.setActivo(o.getActivo());
            e.setId(o.getId());
            respuesta.getInventario().add(e);
        }
        
        return respuesta;
    }

    @PayloadRoot(localPart = "ModificarProductoRequest", namespace = "https://t4is.uv.mx/inventario")
    @ResponsePayload
    public ModificarProductoResponse modificarproducto(@RequestPayload ModificarProductoRequest peticion) {
        ModificarProductoResponse respuesta = new ModificarProductoResponse();
        Inventariox inventariox = new Inventariox();
        inventariox.setId(peticion.getId());
        inventariox.setNombre(peticion.getNcodigo());
        inventariox.setCodigo(peticion.getNcodigo());
        inventariox.setCantidad(peticion.getNcantidad());
        inventariox.setCosto(peticion.getNcosto());
        inventariox.setDescripcion(peticion.getNdescripcion());
        inventariox.setActivo(peticion.getNactivo());

        iinventario.save(inventariox);
        
        respuesta.setId(peticion.getId());
        respuesta.setNombre(peticion.getNnombre());
        respuesta.setCodigo(peticion.getNcodigo());
        respuesta.setCantidad(peticion.getNcantidad());
        respuesta.setCosto(peticion.getNcosto());
        respuesta.setDescripcion(peticion.getNdescripcion());
        respuesta.setActivo(peticion.getNactivo());
        
        return respuesta;
    }
    
    /*
    @PayloadRoot(localPart = "BorrarProductoResponse", namespace = "https://t4is.uv.mx/inventario")
    @ResponsePayload
    public BorrarProductoResponse borrarproducto (@RequestPayload BorrarProductoResponse peticion) {
        BorrarProductoResponse respuesta = new BorrarProductoResponse();
        respuesta.getInventario().clear();

        iinventario.deleteById(peticion.getId());        
        
        respuesta.setId(peticion.getId());
        respuesta.setNombre(peticion.getNombre());
        respuesta.setCodigo(peticion.getCodigo());
        respuesta.setCantidad(peticion.getCantidad());
        respuesta.setCosto(peticion.getCodigo());
        respuesta.setDescripcion(peticion.getDescripcion());
        respuesta.setActivo(peticion.getActivo());

        return respuesta;
    }
    */

}
