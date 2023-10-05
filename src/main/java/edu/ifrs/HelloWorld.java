package edu.ifrs;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/helloworld")
public class HelloWorld {
    @ConfigProperty(name = "Ifrs.pw2")
    String message;

    @GET
    public String hello() {
        return message;
    };
}
