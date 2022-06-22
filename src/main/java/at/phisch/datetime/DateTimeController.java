package at.phisch.datetime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DateTimeController {

    @GetMapping("/api/time")
    public String time() {
        return DateTime.getTime(Clock.systemDefaultZone());
    }

    @GetMapping("/api/date")
    public String date() {
        return DateTime.getDate(Clock.systemDefaultZone());
    }

}