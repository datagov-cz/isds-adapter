package cz.gov.data.isds.rdf;

import cz.gov.data.isds.model.Attachment;
import cz.gov.data.isds.model.Message;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class TurtleBuilder {

    private static final ValueFactory VALUE_FACTORY =
            SimpleValueFactory.getInstance();

    public static String acceptedMessage(
            Message message, Attachment attachment) {
        StringTurtleWriter writer = new StringTurtleWriter();
        addPrefixes(writer);

        IRI iri = createAcceptedIri(message);
        writer.addType(iri, Vocabulary.PrijatyZaznam);
        addMetadata(writer, iri, message);
        addAttachment(writer, iri, message, attachment);
        return writer.toString();
    }

    private static IRI createAcceptedIri(Message message) {
        return VALUE_FACTORY.createIRI(
                Vocabulary.ACCEPTED_PREFIX + message.getId());
    }

    private static void addPrefixes(StringTurtleWriter writer) {
        writer.getWriter().handleNamespace("nkod", Vocabulary.NKOD_PREFIX);
        writer.getWriter().handleNamespace("ds", Vocabulary.NKOD_DS);
    }

    private static void addMetadata(
            StringTurtleWriter writer, IRI iri, Message message) {
        writer.add(
                iri, Vocabulary.idDatoveZpravy,
                message.getId());
        writer.add(
                iri, Vocabulary.anotace,
                message.getAnnotation());
        IRI poskytovatel = VALUE_FACTORY.createIRI(
                Vocabulary.NKOD_DS + message.getSender());
        writer.add(
                iri, Vocabulary.datovaSchrankaPoskytovatele, poskytovatel);
        writer.add(
                iri, Vocabulary.datovaZpravaPrijata,
                message.getDeliveryTime());
    }

    private static void addAttachment(
            StringTurtleWriter writer, IRI iri,
            Message message, Attachment attachment) {
        writer.add(
                iri, Vocabulary.jmenoSouboru,
                message.getAttachmentName(attachment));
    }

    public static String rejectedMessage(Message message) {
        StringTurtleWriter writer = new StringTurtleWriter();
        addPrefixes(writer);

        IRI iri = createRejectedIri(message);
        writer.addType(iri, Vocabulary.NezpracovanyZaznam);
        addMetadata(writer, iri, message);

        return writer.toString();
    }

    private static IRI createRejectedIri(Message message) {
        return VALUE_FACTORY.createIRI(
                Vocabulary.REJECTED_PREFIX + message.getId());
    }

}
