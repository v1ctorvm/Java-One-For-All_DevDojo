package javaoneforall.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . Anything (1.3 - 123, 133, 1A3, 1@3)

        String regex = "([a-zA-Z0-9\\._-])+@[a-zA-Z]+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotario@gmail.com, #@!zoro@mail.br, test@gmail.com.br, sakura@mail";
        String[] emails  = text.split(",");
        System.out.println((emails[1].trim().matches(regex)));
        System.out.println("#@!zoro@mail.br".matches(regex));

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
