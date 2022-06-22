package at.phisch.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeTest {

    private Clock getClock() {
        Instant instant = Instant.parse("2018-08-19T16:02:42.00Z");
        ZoneId zoneId = ZoneId.of("Europe/Vienna");
        Clock clock = Clock.fixed(instant, zoneId);

        return clock;


    }
    @Test
    void getTime() {
        assertEquals("18:02:42", DateTime.getTime(getClock()));
    }

    @Test
    void getDate() {
        assertEquals("2018-08-19", DateTime.getDate(getClock()));
    }
}