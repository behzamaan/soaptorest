package ir.mb.camel.soaptorest.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "ir.mb.camel.soaptorest.soap.HelloWorld",
        serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {



    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }


}
