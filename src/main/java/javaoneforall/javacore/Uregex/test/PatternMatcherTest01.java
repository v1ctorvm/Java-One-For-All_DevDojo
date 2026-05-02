package javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main() {

        // Regex - Regular Expression
        // Sequencia de caracteres ou metacaracteres que encontra ou valida um texto
        // Ex: validar se tal email, enviou algo em x arquivo

        String regex = "aba";
        String text = "abaaba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text: " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
