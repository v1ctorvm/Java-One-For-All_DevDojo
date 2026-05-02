package javaoneforall.javacore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    static void main() {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinus7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now,nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow,timeNowMinus7Hours);
        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));

        Duration d4 = Duration.ofDays(20);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
