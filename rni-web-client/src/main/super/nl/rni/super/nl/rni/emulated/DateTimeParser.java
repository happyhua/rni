package nl.rni.emulated;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;

public class DateTimeParser {
    private final DateTimeFormat parser;

    public DateTimeParser(String pattern) {
        parser = DateTimeFormat.getFormat(pattern);
    }

    public String format(Date date) {
        return parser.format(date);
    }

    public Date parse(String source) throws Exception {
        return parser.parse(source);
    }
}
