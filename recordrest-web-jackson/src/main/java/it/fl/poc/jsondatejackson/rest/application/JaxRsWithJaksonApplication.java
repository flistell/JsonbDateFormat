package it.fl.poc.jsondatejackson.rest.application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;

import org.glassfish.jersey.CommonProperties;
//import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.message.internal.WriterInterceptorExecutor;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import it.fl.poc.jsondatejackson.rest.DateDemoService;

/* 
 * [jax rs - What exactly is the ResourceConfig class in Jersey 2? - Stack Overflow](https://stackoverflow.com/questions/45625925/what-exactly-is-the-resourceconfig-class-in-jersey-2#45627178)
 */

@ApplicationPath("/resources2")
public class JaxRsWithJaksonApplication extends Application {


    private final Logger logger = Logger.getLogger("it.fl.poc.jsondate.rest.application.ResourceConfig");

    public JaxRsWithJaksonApplication() {
        logger.info("@FL JaxRsWithJaksonApplication()");
    }

    @Override
    public Set<Class<?>> getClasses() {
        logger.info("@FL getClasses()");
        Set<Class<?>> classes = new HashSet<>();
        classes.add(DateDemoService.class);
        classes.add(com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class);
        classes.add(com.fasterxml.jackson.annotation.JsonFormat.class);
        //classes.add(org.glassfish.jersey.jackson.JacksonFeature.class);
        return classes;
    }

        @Override
        public Map<String, Object> getProperties() {
        final Map<String, Object> properties = new HashMap<>();
        properties.put(CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE, true);
        return properties;
    }
}
