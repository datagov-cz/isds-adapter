package cz.opendata.mvcr.isds.model;

import cz.czechpoint.isds.v20.TRecord;

import java.util.Collections;
import java.util.List;

public class Message extends Envelop {

    private final List<Attachment> attachments;

    public Message(TRecord record, List<Attachment> attachments) {
        super(record);
        this.attachments = attachments;
    }

    public List<Attachment> getAttachments() {
        return Collections.unmodifiableList(attachments);
    }

}
