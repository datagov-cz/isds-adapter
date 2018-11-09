package cz.opendata.mvcr.isds;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;

public class CalendarFactory {

    private static final int MINUTE_AS_MS = 3600000;

    public static XMLGregorianCalendar create(int field, int amount)
            throws DatatypeConfigurationException {
        DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
        Calendar from = Calendar.getInstance();
        from.add(field, amount);
        return dataTypeFactory.newXMLGregorianCalendar(
                from.get(Calendar.YEAR),
                from.get(Calendar.MONTH) + 1,
                from.get(Calendar.DAY_OF_MONTH),
                0, 0, 0, 0,
                from.get(Calendar.ZONE_OFFSET) / MINUTE_AS_MS);
    }

}
