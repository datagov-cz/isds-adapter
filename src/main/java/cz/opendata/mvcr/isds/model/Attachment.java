package cz.opendata.mvcr.isds.model;

import cz.czechpoint.isds.v20.TFilesArray;

public class Attachment {

    private final String type;

    private final String description;

    private final String mimeType;

    private final byte[] content;

    public Attachment(TFilesArray.DmFile file, byte[] content) {
        this.type = file.getDmFileMetaType();
        this.description = file.getDmFileDescr();
        this.mimeType = file.getDmMimeType();
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getMimeType() {
        return mimeType;
    }

    public byte[] getContent() {
        return content;
    }

}
