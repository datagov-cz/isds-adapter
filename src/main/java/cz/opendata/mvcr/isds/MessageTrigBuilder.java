package cz.opendata.mvcr.isds;

import cz.opendata.mvcr.isds.model.Attachment;
import cz.opendata.mvcr.isds.model.Message;

public class MessageTrigBuilder {

    private static final String NKOD_PREFIX =
            "https://data.gov.cz/slovník/nkod/";

    private static final String NKOD_DS =
            "https://data.gov.cz/zdroj/datové-schránky/";

    private static final String RESOURCE_PREFIX =
            "https://data.gov.cz/zdroj/nkod/přijaté-záznamy/";

    public static String build(Message message) {
        StringBuilder builder = new StringBuilder();
        builder.append("@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .");
        builder.append("@prefix nkod: <" + NKOD_PREFIX + "> .\n");
        builder.append("@prefix ds: <" + NKOD_DS + "> .\n");
        builder.append("\n");
        builder.append("</" + RESOURCE_PREFIX + "/" + message.getId() + ">\n");
        builder.append("  a nkod:PřijatýZáznam ;\n");
        builder.append("    nkod:id-datové-zprávy \""
                + message.getId() + "\" ;\n");
        builder.append("    nkod:datová-schránka-poskytovatele ds:"
                + message.getSender() + " ;\n");
        builder.append("    nkod:datová-zpráva-přijata \""
                + message.getDeliveryTime() + "\"^^xsd:dateTime ;\n");
        for (Attachment attachment : message.getAttachments()) {
            builder.append("    nkod:jméno-souboru \""
                    + message.getAttachmentName(attachment) + "\" ;\n");
        }
        builder.append(".\n");
        return builder.toString();
    }

}
