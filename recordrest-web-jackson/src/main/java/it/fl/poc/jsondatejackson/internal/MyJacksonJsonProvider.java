package it.fl.poc.jsondatejackson.internal;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.cfg.Annotations;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Provider
@Consumes(MediaType.WILDCARD) // NOTE: required to support "non-standard" JSON variants
@Produces(MediaType.WILDCARD)
public class MyJacksonJsonProvider extends JacksonJsonProvider{
        private final Logger logger = Logger.getLogger("it.fl.poc.jsondate.internal.MyJacksonProvider");

        public MyJacksonJsonProvider() {
            super();
            logger.info("@FL MyJacksonProvider()");
    }

    public MyJacksonJsonProvider(Annotations... annotationsToUse) {
        this(null, annotationsToUse);
        logger.info("@FL MyJacksonJsonProvider(Annotations...)");
    }

    public MyJacksonJsonProvider(ObjectMapper mapper) {
        super(mapper, BASIC_ANNOTATIONS);
        logger.info("@FL MyJacksonJsonProvider(ObjectMapper)");
    }

    public MyJacksonJsonProvider(ObjectMapper mapper, Annotations[] annotationsToUse) {
        super(mapper, annotationsToUse);
        logger.info("@FL MyJacksonJsonProvider(ObjectMapper, Annotations[])");
    }

}