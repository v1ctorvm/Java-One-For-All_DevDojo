package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main() {

        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("222222", "iPhone");
        Smartphone s3 = new Smartphone("333333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

//        smartphones.clear();

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("222222", "");
//        System.out.println(smartphones.contains(s4));
        int indexOf = smartphones.indexOf(s4);
        if (indexOf != -1){
            System.out.println("-----------");
            System.out.println(smartphones.get(indexOf));
        }






    }
}
