package it.fl.poc.jsondatejackson.rest;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DateObject implements Serializable {
    private static final String CLASS_NAME = DateObject.class.getName();
    private static final Logger logger = Logger.getLogger(CLASS_NAME);
    private static final long serialVersionUID = 1L;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")  // 2023-06-19 @FL DOES NOT SEEMS TO WORK
    private java.util.Date date;                            // ISO_DATE (or ISO_DATE_TIME if time value specified) 
    private java.util.Calendar calendar;                    // ISO_DATE (or ISO_DATE_TIME if time value specified) 
    private java.util.GregorianCalendar gregorianCalendar;  // ISO_DATE (or ISO_DATE_TIME if time value specified) 
    private java.util.TimeZone timeZone;                    // NormalizedCustomID as specified in java.util.TimeZone 
    //private java.util.SimpleTimeZone simpleTimeZone;        // NormalizedCustomID as specified in java.util.TimeZone 
    //private java.time.Instant instant;                      // ISO_INSTANT 
    //private java.time.Duration duration;                    // java.time.Duration is the ISO 8601 seconds based representation 
    //private java.time.Period period;                        // ISO 8661 Period representation 
    //private java.time.LocalDate localDate;                  // ISO_LOCAL_DATE 
    //private java.time.LocalTime localTime;                  // ISO_LOCAL_TIME 
    //private java.time.LocalDateTime localDateTime;          // ISO_LOCAL_DATE_TIME 
    //private java.time.ZonedDateTime zonedDateTime;          // ISO_ZONED_DATE_TIME 
    //private java.time.ZoneId zoneId;                        // ZoneID as specified in java.time.ZoneId 
    //private java.time.ZoneOffset zoneOffset;                // Zone offset as specified in java.tim.ZoneOffset 
    //private java.time.OffsetDateTime offsetDateTime;        // ISO_OFFSET_DATE_TIME 
    //private java.time.OffsetTime offsetTime;                // ISO_OFFSET_TIME 

  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
  public java.util.Date getDate() {
        logger.info("@FL getDate() - ENTERING");
        try {
            throw new Exception("getDate exception for debuggging.");
        } catch (Exception e) {
            logger.log(Level.INFO, "@FL DEBUG Exception", e); 
            //e.printStackTrace(System.err);
        }
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public java.util.Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(java.util.Calendar calendar) {
        this.calendar = calendar;
    }

    public java.util.GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(java.util.GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public java.util.TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(java.util.TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    // public java.util.SimpleTimeZone getSimpleTimeZone() {
    //     return simpleTimeZone;
    // }

    // public void setSimpleTimeZone(java.util.SimpleTimeZone simpleTimeZone) {
    //     this.simpleTimeZone = simpleTimeZone;
    // }

    // public java.time.Instant getInstant() {
    //     return instant;
    // }

    // public void setInstant(java.time.Instant instant) {
    //     this.instant = instant;
    // }

    // public java.time.Duration getDuration() {
    //     return duration;
    // }

    // public void setDuration(java.time.Duration duration) {
    //     this.duration = duration;
    // }

    // public java.time.Period getPeriod() {
    //     return period;
    // }

    // public void setPeriod(java.time.Period period) {
    //     this.period = period;
    // }

    // public java.time.LocalDate getLocalDate() {
    //     return localDate;
    // }

    // public void setLocalDate(java.time.LocalDate localDate) {
    //     this.localDate = localDate;
    // }

    // public java.time.LocalTime getLocalTime() {
    //     return localTime;
    // }

    // public void setLocalTime(java.time.LocalTime localTime) {
    //     this.localTime = localTime;
    // }

    // public java.time.LocalDateTime getLocalDateTime() {
    //     return localDateTime;
    // }

    // public void setLocalDateTime(java.time.LocalDateTime localDateTime) {
    //     this.localDateTime = localDateTime;
    // }

    // public java.time.ZonedDateTime getZonedDateTime() {
    //     return zonedDateTime;
    // }

    // public void setZonedDateTime(java.time.ZonedDateTime zonedDateTime) {
    //     this.zonedDateTime = zonedDateTime;
    // }

    // public java.time.ZoneId getZoneId() {
    //     return zoneId;
    // }

    // public void setZoneId(java.time.ZoneId zoneId) {
    //     this.zoneId = zoneId;
    // }

    // public java.time.ZoneOffset getZoneOffset() {
    //     return zoneOffset;
    // }

    // public void setZoneOffset(java.time.ZoneOffset zoneOffset) {
    //     this.zoneOffset = zoneOffset;
    // }

    // public java.time.OffsetDateTime getOffsetDateTime() {
    //     return offsetDateTime;
    // }


    // public void setOffsetDateTime(java.time.OffsetDateTime offsetDateTime) {
    //     this.offsetDateTime = offsetDateTime;
    // }


    // public java.time.OffsetTime getOffsetTime() {
    //     return offsetTime;
    // }


    // public void setOffsetTime(java.time.OffsetTime offsetTime) {
    //     this.offsetTime = offsetTime;
    // }

}
