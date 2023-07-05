package it.fl.poc.jsondatejackson.rest.application;

import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.message.internal.WriterInterceptorExecutor;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import it.fl.poc.jsondatejackson.rest.DateDemoService;

@ApplicationPath("/resources2")
public class JaxRsWithJaksonApplication extends ResourceConfig{

    private final Logger logger = Logger.getLogger("it.fl.poc.jsondate.rest.application.ResourceConfig");

    public JaxRsWithJaksonApplication(){
        logger.info("@FL JaxRsWithJaksonApplication()");
        
        /* 1. with `org.glassfish.jersey.jackson.JacksonFeature.class)` alone you get unformatted dates.
         * 2. Order seems to matter: 
         *       - first register com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class
         *       - then register org.glassfish.jersey.jackson.JacksonFeature.class
         * Stack Trace:
         * java.lang.Exception: getDate exception for debuggging.
         *    at it.fl.poc.jsondatejackson.rest.DateObject.getDate(DateObject.java:41)
         *    at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
         *    at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
         *    at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
         *    at java.base/java.lang.reflect.Method.invoke(Method.java:566)
         *    at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:688)
         *    at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:722)
         *    at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:166)
         *    at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize(DefaultSerializerProvider.java:480)
         *    at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:319)
         *    at com.fasterxml.jackson.databind.ObjectWriter$Prefetch.serialize(ObjectWriter.java:1433)
         *    at com.fasterxml.jackson.databind.ObjectWriter.writeValue(ObjectWriter.java:921)
         *    at org.glassfish.jersey.jackson.internal.jackson.jaxrs.base.ProviderBase.writeTo(ProviderBase.java:648)
         *    at org.glassfish.jersey.message.internal.WriterInterceptorExecutor$TerminalWriterInterceptor.invokeWriteTo(WriterInterceptorExecutor.java:242)
         *    at org.glassfish.jersey.message.internal.WriterInterceptorExecutor$TerminalWriterInterceptor.aroundWriteTo(WriterInterceptorExecutor.java:227)
         *    at org.glassfish.jersey.message.internal.WriterInterceptorExecutor.proceed(WriterInterceptorExecutor.java:139)
         *    at weblogic.jaxrs.server.internal.ChunkedOutputWriter.aroundWriteTo(ChunkedOutputWriter.java:72)
         *    at org.glassfish.jersey.message.internal.WriterInterceptorExecutor.proceed(WriterInterceptorExecutor.java:139)
         *    at org.glassfish.jersey.server.internal.JsonWithPaddingInterceptor.aroundWriteTo(JsonWithPaddingInterceptor.java:85)
         *    at org.glassfish.jersey.message.internal.WriterInterceptorExecutor.proceed(WriterInterceptorExecutor.java:139)
         *    at org.glassfish.jersey.server.internal.MappableExceptionWrapperInterceptor.aroundWriteTo(MappableExceptionWrapperInterceptor.java:61)
         *    at org.glassfish.jersey.message.internal.WriterInterceptorExecutor.proceed(WriterInterceptorExecutor.java:139)
         *    at org.glassfish.jersey.message.internal.MessageBodyFactory.writeTo(MessageBodyFactory.java:1115)
         *    [...]
        */
        
        //register(org.glassfish.jersey.jackson.JacksonFeature.class);  
        register(JacksonFeature.class);
        register(com.fasterxml.jackson.annotation.JsonFormat.class);
        //register(DateDemoService.class);
        property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
        packages("it.fl.poc.jsondatejackson.rest");
    }
    
}

