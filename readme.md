# Jackson JsonFormat with JavaEE 8 JAX-RS/Jersey

Demo code to show how to force the use of Jackson 2.x with Jersesy 2.x.

## Build

Build with usual

```
    $ mvn package
```
## Testing

URL: http://localhost:7001/recordrest-web-jackson/resources3/datedemo


## Resources

### Sources

* [eclipse-ee4j/jersey at 2.29](https://github.com/eclipse-ee4j/jersey/tree/2.29)
* [rest/jaxrs-api at 2.1.6 · jakartaee/rest · GitHub](https://github.com/jakartaee/rest/tree/2.1.6/jaxrs-api)
* [FasterXML/jackson: Main Portal page for the Jackson project](https://github.com/FasterXML/jackson)

### Specs

* [Chapter 4. Application Deployment and Runtime Environments](https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/deployment.html#deployment.autodiscoverable)


### Isseus

* [JEE RestApplication - Weblogic - Unpredicatable behavior on which provider gets used · Issue #107 · FasterXML/jackson-jaxrs-providers](https://github.com/FasterXML/jackson-jaxrs-providers/issues/107) ⭐⭐⭐⭐⭐

* [Issues · eclipse-ee4j/jersey](https://github.com/eclipse-ee4j/jersey/issues?q=jackson)

### WebLogic 

- [What's New in Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/notes/whatsnew.html#GUID-DF8CFD1C-9DD1-423E-ACA6-9717D5738385)
- [Developing and Securing RESTful Web Services for Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/restf/jersey-back-comp.html#GUID-3219374B-7213-4D1F-A0E9-A6113FF44EB4)
- [Developing JAX-WS Web Services for Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wsget/jax-ws-intro.html#GUID-49D730F9-1F69-43DE-980C-7A18FB5285D9)
- [Upgrading Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlupg/upgrade_ws.html#GUID-A9BF7068-B532-4A2D-96D8-6B2B9EFBFD71)
- [Java API for JSON Processing](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlprg/java-api-for-json-proc.html#GUID-53ED16E0-0669-4698-AAAB-BB0C7B9A977B)
- [Java API for JSON Binding](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlprg/java-api-json-binding.html#GUID-203F8D60-C2E9-4183-8357-00B8A289E3D9)

### Other

* [Code search results FEATURE_AUTO_DISCOVERY· GitHub](https://github.com/search?q=repo%3Aeclipse-ee4j/jersey%20FEATURE_AUTO_DISCOVERY_DISABLE&type=code)
* [Configuring JAX-RS web applications - IBM Documentation](https://www.ibm.com/docs/en/was/9.0.5?topic=applications-configuring-jax-rs-web)
* [FasterXML/jackson-jaxrs-providers: Multi-module project that contains Jackson-based "old" JAX-RS (ones under \`javax.ws.rs\`) providers for JSON, XML, YAML, Smile, CBOR formats](https://github.com/FasterXML/jackson-jaxrs-providers)
* [java - How to disable Jersey's JacksonJsonProvider auto registration so I use my own? - Stack Overflow](https://stackoverflow.com/questions/23441095/how-to-disable-jerseys-jacksonjsonprovider-auto-registration-so-i-use-my-own) ⭐⭐⭐⭐
* [java - How to set up JAX-RS Application using annotations only (no web.xml)? - Stack Overflow](https://stackoverflow.com/questions/9373081/how-to-set-up-jax-rs-application-using-annotations-only-no-web-xml)
* [java - Jersey: disable default JSON provider - Stack Overflow](https://stackoverflow.com/questions/30278303/jersey-disable-default-json-provider)
* [java - Jersey: disable default JSON provider - Stack Overflow](https://stackoverflow.com/questions/30278303/jersey-disable-default-json-provider) ⭐⭐⭐⭐⭐
* [java - Use Jackson as JAXB-JSON-processor in JavaEE Application - Stack Overflow](https://stackoverflow.com/questions/29698350/use-jackson-as-jaxb-json-processor-in-javaee-application)
* [jax rs - What exactly is the ResourceConfig class in Jersey 2? - Stack Overflow](https://stackoverflow.com/questions/45625925/what-exactly-is-the-resourceconfig-class-in-jersey-2#45627178)
* [JAX-RS 2.0 behavior changes - IBM Documentation](https://www.ibm.com/docs/en/was-zos/9.0.5?topic=applications-jax-rs-20-behavior-changes)
* [Jersey 2.6 Jackson provider registering - Stack Overflow](https://stackoverflow.com/questions/27935273/jersey-2-6-jackson-provider-registering)
* [json - Unable to upgrade to Jackson 2.1.4, Jersey ignoring the annotations - Stack Overflow](https://stackoverflow.com/questions/15436268/unable-to-upgrade-to-jackson-2-1-4-jersey-ignoring-the-annotations)
* [rest - Configure Jackson as JSON Provider in JAX-RS 2.0 - Stack Overflow](https://stackoverflow.com/questions/18741954/configure-jackson-as-json-provider-in-jax-rs-2-0)
* [rest - Do we still need JacksonFeature.class for Jersey 2.17 projects? - Stack Overflow](https://stackoverflow.com/questions/29247251/do-we-still-need-jacksonfeature-class-for-jersey-2-17-projects)
* [Using Jackson as JSON provider in Jersey 2.x | cassiomolin](https://cassiomolin.com/2016/08/10/using-jackson-as-json-provider-in-jersey-2x/)