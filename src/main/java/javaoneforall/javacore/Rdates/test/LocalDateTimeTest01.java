package javaoneforall.javacore.Rdates.test;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    static void main() {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getHour());
        String hora = ldt.toString();
        System.out.println(hora);

    }
}
