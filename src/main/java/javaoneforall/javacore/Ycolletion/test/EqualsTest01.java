package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Smartphone;

public class EqualsTest01 {
    static void main() {


        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("1BACN2", "Pixel");

        System.out.println(s1.equals(s2));
    }
}
