package javaoneforall.javacore.Sformatting.test;

import java.util.Locale;

public class LocaleTest02 {
    static void main() {


        System.out.println(Locale.getDefault());
        String[] isoContries = Locale.getISOCountries();
        String[] isoLanguages =Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages){
            System.out.print(isoLanguage + " ");
        }
        System.out.println();
        for (String isoCauntries : isoContries){
            System.out.print(isoCauntries + " ");
        }
    }
}
