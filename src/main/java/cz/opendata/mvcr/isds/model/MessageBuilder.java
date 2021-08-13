package cz.opendata.mvcr.isds.model;

import cz.czechpoint.isds.v20.TFilesArray;
import cz.czechpoint.isds.v20.TRecord;
import cz.czechpoint.isds.v20.TReturnedMessage;

import org.w3c.dom.Element;

import javax.xml.transform.Source;
import javax.xml.transform.Result;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.stream.Collectors;

public class MessageBuilder {

    public Message build(TRecord record, TReturnedMessage message) {
        List<TFilesArray.DmFile> files =
                message.getDmDm().getDmFiles().getDmFile();
        List<Attachment> attachments = files.stream()
                .map((file) -> new Attachment(file, asByteArray(file)))
                .collect(Collectors.toList());
        // TODO Compute hash and validate the message content?
        return new Message(record, attachments);
    }

    private byte[] asByteArray(TFilesArray.DmFile file) {
        if (file.getDmEncodedContent() != null) {
            return file.getDmEncodedContent();
        } else if (file.getDmXMLContent() != null) {
            return xmlContentToByteArray(file);
        } else {
            throw new RuntimeException(
                    "Missing content for: " + file.getDmFileDescr());
        }
    }

    private byte[] xmlContentToByteArray(TFilesArray.DmFile file) {
        Element element = (Element) file.getDmXMLContent().getAny();
        try {
            Source source = new DOMSource(element);
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            Result result = new StreamResult(output);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.transform(source, result);
            return output.toByteArray();
        } catch (TransformerException ex) {
            throw new RuntimeException(ex);
        }
    }

}
