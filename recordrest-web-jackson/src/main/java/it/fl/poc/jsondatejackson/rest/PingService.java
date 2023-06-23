package it.fl.poc.jsondate.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/ping")
public class PingService {

    @GET
    @Produces(MediaType.TEXT_PLAIN) 
    public Object ping(){
        return "pong";
    }
}