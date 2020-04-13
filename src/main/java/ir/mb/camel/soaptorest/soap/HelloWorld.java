package ir.mb.camel.soaptorest.soap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.ws.sample/", name = "Hello")
public interface HelloWorld {


    String sayHi(String text);


}
