package javaoneforall.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    static void main() {
        NumberFormat.getInstance();

        Locale localeBR = new  Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance(); // Default of PC
        numberFormats[1] = NumberFormat.getInstance(localeJP);
        numberFormats[2] = NumberFormat.getInstance(localeBR);
        numberFormats[3] = NumberFormat.getInstance(localeIT);

        double value = 100_000_000.2130;

        for (NumberFormat nfa : numberFormats){
            System.out.println(nfa.format(value));
        }

    }
}
