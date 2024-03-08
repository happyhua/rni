package nl.rni.emulated;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeParser {
    private final DateFormat parser;

    public DateTimeParser(String pattern) {
        parser = new SimpleDateFormat(pattern);
    }

    public String format(Date date) {
        return parser.format(date);
    }

    public Date parse(String source) throws Exception {
        return parser.parse(source);
    }
}
