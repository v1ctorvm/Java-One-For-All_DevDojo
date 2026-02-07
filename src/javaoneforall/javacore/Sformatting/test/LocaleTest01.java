package javaoneforall.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main() {

        // ISo 639, ISO 3166
        // pt-BR
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapan = new Locale("ja","JP");

        Calendar c = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapan);

        System.out.println(df1.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
        System.out.println(df3.format(c.getTime()));
        System.out.println(df4.format(c.getTime()));


        System.out.println(localeItaly.getDisplayCountry(localeCH));
        System.out.println(localeItaly.getDisplayLanguage(localeCH));

    }
}
