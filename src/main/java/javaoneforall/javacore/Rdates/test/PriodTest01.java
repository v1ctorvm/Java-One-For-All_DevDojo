package javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PriodTest01 {
    static void main() {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinus7Hours = LocalTime.now().minusHours(7);

        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);

        Period p1 = Period.between(now,nowAfterTwoYears);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.YEARS));
    }
}
