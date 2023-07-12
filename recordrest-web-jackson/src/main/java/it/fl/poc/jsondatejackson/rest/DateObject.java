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


  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
  public java.util.Date getDate() {
        logger.info("@FL getDate() - ENTERING");
        try {
            throw new Exception("getDate exception for debuggging.");
        } catch (Exception e) {
            logger.log(Level.INFO, "@FL DEBUG Exception", e); 
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
}
