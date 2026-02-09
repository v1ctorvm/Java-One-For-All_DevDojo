package javaoneforall.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTet01 {
    static void main() {

        LocalDateTime birthdate = LocalDateTime.of(2007, Month.JULY,15,12,0,0);
        System.out.println(ChronoUnit.DAYS.between(birthdate,LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(birthdate,LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(birthdate,LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(birthdate,LocalDateTime.now()));

    }
}
