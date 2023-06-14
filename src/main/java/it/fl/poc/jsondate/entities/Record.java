package it.fl.poc.jsondate.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import it.fl.poc.jsondate.utils.JacksonTimestampDeserializer;
import it.fl.poc.jsondate.utils.JacksonTimestampSerializer;

/*
 * https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/ejbad/using_toplink.html#GUID-9BC674DF-7DF1-413C-91AC-667315E45610
 */

@Entity
@Table(name="APP_TABLE")
@NamedQuery(name="Record.findAll", query="SELECT * from APP_TABLE")
@NamedQuery(name="Record.findById", query="SELECT * from APP_TABLE WHERE id == :id")
public class Record implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private Timestamp timestamp;
    private Date date;

    // public Record(String id) {
    //     this.setId(id);
    //     this.setTimestamp(new Timestamp(System.currentTimeMillis()));
    //     Calendar c = new GregorianCalendar();
    //     c.set(Calendar.HOUR_OF_DAY, 0); // anything 0 - 23
    //     c.set(Calendar.MINUTE, 0);
    //     c.set(Calendar.SECOND, 0);
    //     c.set(Calendar.MILLISECOND, 0);
    //     c.setTimeZone(TimeZone.getTimeZone("UTC"));
    //     this.setDate(new Timestamp((c.getTime()).getTime()));
    //     System.err.println("Timestamp: " + this.timestamp);
    //     System.err.println("Date: " + this.date);
    // }


    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // @JsonSerialize(using = JacksonTimestampSerializer.class)
    // @JsonDeserialize(using = JacksonTimestampDeserializer.class)
    public Timestamp getTimestamp() {
        System.err.println("getTimestamp() - " + this.timestamp);
        try {
            throw new Exception("getTimestamp exception for debuggging.");
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace(System.err);
        }
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Timestamp getDate() {
        System.err.println("getDate() - " + this.timestamp);
        try {
            throw new Exception("getDate exception for debuggging.");
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace(System.err);
        }
        return date;
    }

}
