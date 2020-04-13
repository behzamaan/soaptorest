package ir.mb.camel.soaptorest;

import javax.xml.ws.Endpoint;

import ir.mb.camel.soaptorest.soap.HelloWorldImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class WebServiceConfig {
    private Bus bus;

    public WebServiceConfig(Bus bus) {
        this.bus = bus;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloWorldImpl());
        endpoint.publish("/Hello");
        return endpoint;
    }
}
