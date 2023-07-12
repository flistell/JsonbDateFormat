package it.fl.poc.jsondatejackson.rest;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/datedemo")
public class DateDemoService {
  private static final String CLASS_NAME = DateDemoService.class.getName();
  private static final Logger logger = Logger.getLogger(CLASS_NAME);

  @Context
  private Configuration context;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Object getDate() {
    DateObject dateObj = new DateObject();
    logger.info("@FL GET Date");
    dateObj.setDate(new Date());
    dateObj.setCalendar(Calendar.getInstance());
    dateObj.setGregorianCalendar(GregorianCalendar.from(ZonedDateTime.now()));
    dateObj.setTimeZone(TimeZone.getDefault());
    if (context != null) {
      Map<String, Object> configurationProperties = context.getProperties();
      for (String k : configurationProperties.keySet()) {
        logger.info("@FL Configuration Property: [" + k + "]=[" + configurationProperties.get(k).toString() + "]");
      }
    } else {
        logger.info("@FL Configuration context NULL");
    }

    return dateObj;
  }

}
