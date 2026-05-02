package javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    static void main() {

        // Regex - Regular Expression
        // Sequencia de caracteres ou metacaracteres que encontra ou valida um texto
        // Ex: validar se tal email, enviou algo em x arquivo

        // \d - All the digits 0-9
        // \D - Everything that isn't \d
        // \s - All the blank spaces and \t \r \f \n
        // \S - Everything that isn't \n
        // \w - All the letters a-z A-Z 0-9, _
        // \W - Everything that isn't \w


        String regex = "\\w";
        String text = "abaaba";
        String text2 = "43_lh2 h4\t32!4";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text: " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}
