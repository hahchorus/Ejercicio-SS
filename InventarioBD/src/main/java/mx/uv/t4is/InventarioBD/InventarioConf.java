package mx.uv.t4is.InventarioBD;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class InventarioConf {

    //El Bean sirven para la interface web pueda tener acceso a los accesos de la clase
    //Los @ sirven como anotaciones para lo frimewoks para que el codigo tenga
    //unas anotaciones en particular
    @Bean
    public XsdSchema inventarioSchema() {
        return new SimpleXsdSchema(new ClassPathResource("inventario.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
        ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
 
    //Devuelve un wsdl 
    @Bean(name = "inventario")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema inventarioSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("inventarioPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("https://t4is.uv.mx/inventario");
        wsdl.setSchema(inventarioSchema);
        return wsdl;
    }
    
    
}
