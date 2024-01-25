package cz.gov.data.isds.rdf;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public final class Vocabulary {

    public static final String NKOD_PREFIX =
            "https://data.gov.cz/slovník/nkod/";

    public static final String NKOD_DS =
            "https://data.gov.cz/zdroj/datové-schránky/";

    public static final String ACCEPTED_PREFIX =
            "https://data.gov.cz/zdroj/nkod/přijaté-záznamy/";

    public static final String REJECTED_PREFIX =
            "https://data.gov.cz/zdroj/nkod/nezpracované-záznamy/";

    public static final IRI PrijatyZaznam;

    public static final IRI idDatoveZpravy;

    public static final IRI anotace;

    public static final IRI datovaSchrankaPoskytovatele;

    public static final IRI datovaZpravaPrijata;

    public static final IRI jmenoSouboru;

    public static final IRI NezpracovanyZaznam;

    static {
        ValueFactory valueFactory = SimpleValueFactory.getInstance();
        PrijatyZaznam = valueFactory.createIRI(
                NKOD_PREFIX + "PřijatýZáznam");
        idDatoveZpravy = valueFactory.createIRI(
                NKOD_PREFIX + "id-datové-zprávy");
        anotace = valueFactory.createIRI(
                NKOD_PREFIX + "anotace");
        datovaSchrankaPoskytovatele = valueFactory.createIRI(
                NKOD_PREFIX + "datová-schránka-poskytovatele");
        datovaZpravaPrijata = valueFactory.createIRI(
                NKOD_PREFIX + "datová-zpráva-přijata");
        jmenoSouboru = valueFactory.createIRI(
                NKOD_PREFIX + "jméno-souboru");
        NezpracovanyZaznam = valueFactory.createIRI(
                NKOD_PREFIX + "NezpracovanýZáznam");
    }

}
