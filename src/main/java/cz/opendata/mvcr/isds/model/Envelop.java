package cz.opendata.mvcr.isds.model;

import cz.czechpoint.isds.v20.TRecord;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public class Envelop {

    private final String id;

    private final String annotation;

    private final String sender;

    private final String recipient;

    private final BigInteger status;

    private final XMLGregorianCalendar deliveryTime;

    private final XMLGregorianCalendar acceptanceTime;

    public Envelop(TRecord record) {
        this.id = record.getDmID();
        this.annotation = record.getDmAnnotation();
        this.sender = record.getDbIDSender();
        this.recipient = record.getDbIDRecipient();
        this.status = record.getDmMessageStatus();
        this.deliveryTime = record.getDmDeliveryTime();
        this.acceptanceTime = record.getDmAcceptanceTime();
    }

    public String getId() {
        return this.id;
    }

    public String getAnnotation() {
        return this.annotation;
    }

    public String getSender() {
        return this.sender;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public BigInteger getStatus() {
        return this.status;
    }

    public XMLGregorianCalendar getDeliveryTime() {
        return this.deliveryTime;
    }

    public XMLGregorianCalendar getAcceptanceTime() {
        return this.acceptanceTime;
    }

}
