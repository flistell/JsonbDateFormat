package it.fl.poc.jsondatejackson.rest.application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.CommonProperties;
import it.fl.poc.jsondatejackson.rest.DateDemoService;

/* 
 * [jax rs - What exactly is the ResourceConfig class in Jersey 2? - Stack Overflow](https://stackoverflow.com/questions/45625925/what-exactly-is-the-resourceconfig-class-in-jersey-2#45627178)
 */

@ApplicationPath("/resources2a")
public class JaxRsWithJacksonApplication extends Application {

    private static final String CLASS_NAME = JaxRsWithJacksonApplication.class.getName();
    private static final Logger logger = Logger.getLogger(CLASS_NAME);

    public JaxRsWithJacksonApplication() {
        logger.info("@FL JaxRsWithJacksonApplication()");
    }

    @Override
    public Set<Class<?>> getClasses() {
        logger.info("@FL getClasses()");
        Set<Class<?>> classes = new HashSet<>();
        // classes.add(com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class);
        // classes.add(org.glassfish.jersey.jackson.JacksonFeature.class);
        Set<Class<?>> parentClasses = super.getClasses();
        Iterator<Class<?>> citer = parentClasses.iterator();
        while (citer.hasNext()){
            Class<?> c = citer.next();
            logger.info("@FL   parentClass: [" + c.getCanonicalName() + "].");
        }
        classes.add(DateDemoService.class);
        classes.add(org.glassfish.jersey.jackson.JacksonFeature.class);
        classes.add(it.fl.poc.jsondatejackson.internal.MyJacksonJsonProvider.class);
        classes.add(com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class);
        return classes;
    }

    @Override
    public Map<String, Object> getProperties() {
        logger.info("@FL getProperties()");
        final Map<String, Object> properties = new HashMap<>();

        Map<String, Object> parentProps = super.getProperties();
        for (String p: parentProps.keySet()){
            logger.info("@FL   parentProp: [" + p + "]: [" + parentProps.get(p) + "].");
        }

        properties.put(CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE, true);
        properties.put(CommonProperties.MOXY_JSON_FEATURE_DISABLE, true);
        properties.put(CommonProperties.JSON_PROCESSING_FEATURE_DISABLE, true);
        //properties.put(CommonProperties.METAINF_SERVICES_LOOKUP_DISABLE,true);
        return properties;
    }

    @Override
    public Set<Object> getSingletons() {
        logger.info("@FL getSingletons()");
        Set<Object> singletons = new HashSet<Object>();
        singletons.add(new com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider());
        //singletons.add(new JacksonJaxbJsonProvider());
                try {
            throw new Exception("@FL getSingletons exception for debuggging.");
        } catch (Exception e) {
            logger.log(Level.INFO, "@FL DEBUG Exception", e); 
            //e.printStackTrace(System.err);
        }
        return singletons;
    }
}
