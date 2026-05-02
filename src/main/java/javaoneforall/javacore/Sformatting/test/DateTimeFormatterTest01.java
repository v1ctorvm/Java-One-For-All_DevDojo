package javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    static void main() {

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse = LocalDate.parse("20260209", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-02-09", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-02-09", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format);
        LocalDateTime parse1 = LocalDateTime.parse("2026-02-09T13:20:28.247887");
        System.out.println(parse1);

        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println(LocalDate.now().format(dateTimeFormatterBR));
        LocalDate parseBR = LocalDate.parse("09/02/2026", dateTimeFormatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterIT = DateTimeFormatter.ofPattern("dd.MMMM.yyy", Locale.ITALY);
        String formatIT = LocalDate.now().format(formatterIT);
        System.out.println(formatIT);
        LocalDate parseIT = LocalDate.parse("09.febbraio.2026",formatterIT);
        System.out.println(parseIT);

    }
}
