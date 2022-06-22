package at.phisch.datetime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static String getTime(Clock clock) {
        return LocalDateTime.now(clock).format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public static String getDate(Clock clock, String format) {
        return LocalDateTime.now(clock).format(DateTimeFormatter.ofPattern(format));
    }

}
