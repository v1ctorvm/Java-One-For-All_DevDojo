package javaoneforall.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main() {
        NumberFormat.getInstance();

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance(); // Default of PC
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 100_000_000.2130;

        for (NumberFormat nfa : numberFormats) {
            System.out.println(nfa.getMaximumFractionDigits());
            nfa.setMaximumFractionDigits(3);
            System.out.println(nfa.format(value));
        }

        String stringValue = "1234.1234";
        try {
            System.out.println(numberFormats[0].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
