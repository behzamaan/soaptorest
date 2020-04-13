package ir.mb.camel.soaptorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.xml.ws.Endpoint;
@ImportResource({ "classpath:spring/camel-context.xml" })
@SpringBootApplication
public class SoapToRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapToRestApplication.class, args);

    }

}
