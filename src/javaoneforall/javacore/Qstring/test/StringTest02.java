package javaoneforall.javacore.Qstring.test;

public class StringTest02 {
    static void main() {

        String name = "  Luffy";
        String name2 = "luffy";
        System.out.println(name.charAt(0));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.replace("f" ,"l"));
        System.out.println(name.trim()); // Remove Spaces
    }
}
