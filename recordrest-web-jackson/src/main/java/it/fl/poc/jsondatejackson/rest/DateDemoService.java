package it.fl.poc.jsondatejackson.rest;

// import java.time.Duration;
// import java.time.Instant;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.OffsetDateTime;
// import java.time.OffsetTime;
// import java.time.Period;
// import java.time.ZoneId;
// import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
//import java.util.SimpleTimeZone;
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
    // dateObj.setSimpleTimeZone(new SimpleTimeZone(3600000, "Europe/Paris",
    // Calendar.MARCH, -1,
    // Calendar.SUNDAY, 3600000, SimpleTimeZone.UTC_TIME, Calendar.OCTOBER, -1,
    // Calendar.SUNDAY, 3600000, SimpleTimeZone.UTC_TIME, 3600000));
    // dateObj.setInstant(Instant.now());
    // dateObj.setDuration(Duration.ofDays(4L));
    // dateObj.setPeriod(Period.ofMonths(3));
    // dateObj.setLocalDate(LocalDate.now());
    // dateObj.setLocalTime(LocalTime.now());
    // dateObj.setLocalDateTime(LocalDateTime.now());
    // dateObj.setZonedDateTime(ZonedDateTime.now());
    // dateObj.setZoneId(ZoneId.systemDefault());
    // dateObj.setZoneOffset(ZoneOffset.of("+03:30"));
    // dateObj.setOffsetDateTime(OffsetDateTime.now());
    // dateObj.setOffsetTime(OffsetTime.now());
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
