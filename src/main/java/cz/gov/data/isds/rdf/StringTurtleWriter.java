package cz.gov.data.isds.rdf;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.rio.turtle.TurtleWriter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.StringWriter;

public class StringTurtleWriter {

    private static final ValueFactory VALUE_FACTORY =
            SimpleValueFactory.getInstance();

    private final StringWriter outputWriter;

    private final TurtleWriter writer;

    public StringTurtleWriter() {
        this.outputWriter = new StringWriter();
        this.writer = new TurtleWriter(this.outputWriter);
        this.writer.startRDF();
    }

    public void addType(IRI s, IRI type) {
        this.add(s, RDF.TYPE, type);
    }

    public void add(IRI s, IRI p, Value o) {
        this.writer.handleStatement(VALUE_FACTORY.createStatement(s, p, o));
    }

    public void add(IRI s, IRI p, String o) {
        this.writer.handleStatement(
                VALUE_FACTORY.createStatement(
                        s, p, VALUE_FACTORY.createLiteral(o)));
    }

    public void add(IRI s, IRI p, XMLGregorianCalendar o) {
        this.writer.handleStatement(
                VALUE_FACTORY.createStatement(
                        s, p, VALUE_FACTORY.createLiteral(o)));
    }


    @Override
    public String toString() {
        this.writer.endRDF();
        return this.outputWriter.getBuffer().toString();
    }

    public TurtleWriter getWriter() {
        return writer;
    }

}
