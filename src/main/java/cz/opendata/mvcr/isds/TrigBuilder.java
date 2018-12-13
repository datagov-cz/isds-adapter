package cz.opendata.mvcr.isds;

import cz.opendata.mvcr.isds.model.Attachment;
import cz.opendata.mvcr.isds.model.Message;

public class TrigBuilder {

    private static final String NKOD_PREFIX =
            "https://data.gov.cz/slovník/nkod/";

    private static final String NKOD_DS =
            "https://data.gov.cz/zdroj/datové-schránky/";

    private static final String ACCEPTED_PREFIX =
            "https://data.gov.cz/zdroj/nkod/přijaté-záznamy/";

    private static final String REJECTED_PREFIX =
            "https://data.gov.cz/zdroj/nkod/nezpracované-záznamy/";

    public static String acceptedMessage(Message message) {
        StringBuilder builder = new StringBuilder();
        addPrefixes(builder);
        builder.append("<" + ACCEPTED_PREFIX + message.getId() + ">\n");
        builder.append("  a nkod:PřijatýZáznam ;\n");
        addMetadata(builder, message);
        return builder.toString();
    }

    private static void addPrefixes(StringBuilder builder) {
        builder.append("@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n");
        builder.append("@prefix nkod: <" + NKOD_PREFIX + "> .\n");
        builder.append("@prefix ds: <" + NKOD_DS + "> .\n");
        builder.append("\n");
    }

    private static void addMetadata(StringBuilder builder, Message message) {
        builder.append("    nkod:id-datové-zprávy \""
                + message.getId() + "\" ;\n");
        builder.append("    nkod:anotace \""
                + message.getAnnotation() + "\" ;\n");
        builder.append("    nkod:datová-schránka-poskytovatele ds:"
                + message.getSender() + " ;\n");
        builder.append("    nkod:datová-zpráva-přijata \""
                + message.getDeliveryTime() + "\"^^xsd:dateTime ;\n");
        for (Attachment attachment : message.getAttachments()) {
            builder.append("    nkod:jméno-souboru \""
                    + message.getAttachmentName(attachment) + "\" ;\n");
        }
        builder.append(".\n");
    }

    public static String rejectedMessage(Message message) {
        StringBuilder builder = new StringBuilder();
        addPrefixes(builder);
        builder.append("<" + REJECTED_PREFIX + message.getId() + ">\n");
        builder.append("  a nkod:NezpracovanýZáznam ;\n");
        addMetadata(builder, message);
        return builder.toString();
    }

}
