package javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    static void main() {

        // \d - All the digits 0-9
        // \D - Everything that isn't \d
        // \s - All the blank spaces and \t \r \f \n
        // \S - Everything that isn't \n
        // \w - All the letters a-z A-Z 0-9, _
        // \W - Everything that isn't \w
        // [] - All letters inside [a-z]
        // ? zero or one
        // * zero or more
        // + one or more
        // {n,m} ex {0,2} from n to m
        // ()
        // | persons or persona person(a|s)
        // $ end of line

        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text: " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

        int hexNumber = 0xC350;
        System.out.println(hexNumber);

    }
}
