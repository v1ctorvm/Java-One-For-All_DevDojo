package javaoneforall.javacore.Qstring.test;

public class StringBuilderTest01 {
    static void main() {

        String name = "Victor Matheus";
        name.concat(" Paim Cales Cura");
        name.substring(0,4);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Victor Matheus");
        sb.append(" Paim Cales Cura");
        sb.substring(0,4);
        sb.reverse();
        sb.delete(0,3);
        sb.reverse();
        System.out.println(sb);


        String str = "Chocolate";
        String primeiro = String.valueOf(str.charAt(0));

        String ultimo = String.valueOf(str.charAt(str.length()));


    }

}
