package javaoneforall.javacore.Ycolletion.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main() {

        List<String> names = new ArrayList(10);
        List<String> names2 = new ArrayList(10);
        names.add("Victor");
        names.add("V1ctor");
        names2.add("VMAJDNAS");
        names2.add("AUHAA");
        names.addAll(0,names2);



        for (String name : names){
            System.out.println(name);
        }

        System.out.println("--------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }



    }
}
