package cz.gov.data.isds.model;

import cz.czechpoint.isds.v20.TRecord;

import javax.xml.datatype.XMLGregorianCalendar;

public class Envelop {

    private final String id;

    private final String annotation;

    private final String sender;

    private final String recipient;

    private final EnvelopStatus status;

    /**
     * Datum a čas dodání.
     */
    private final XMLGregorianCalendar deliveryTime;

    /**
     * Datum a čas doručení (prvního doručení, tedy v případě doručení fikcí
     * a následného doručení přečtením zde bude čas doručení fikcí).
     */
    private final XMLGregorianCalendar acceptanceTime;

    public Envelop(TRecord record) {
        this.id = record.getDmID();
        this.annotation = record.getDmAnnotation().getValue();
        this.sender = record.getDbIDSender().getValue();
        this.recipient = record.getDbIDRecipient().getValue();
        this.status = EnvelopStatus.fromNumber(record.getDmMessageStatus());
        this.deliveryTime = record.getDmDeliveryTime().getValue();
        this.acceptanceTime = record.getDmAcceptanceTime().getValue();
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

    public EnvelopStatus getStatus() {
        return this.status;
    }

    public XMLGregorianCalendar getDeliveryTime() {
        return this.deliveryTime;
    }

    public XMLGregorianCalendar getAcceptanceTime() {
        return this.acceptanceTime;
    }

}
