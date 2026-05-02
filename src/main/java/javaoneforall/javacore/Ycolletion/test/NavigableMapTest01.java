package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Customer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    static void main() {

        // Comparator to Key Only
        NavigableMap<String, String> map = new TreeMap<>();

        Customer customer = new Customer("Victor");

        map.put("A","Letter A");
        map.put("D","Letter D");
        map.put("C","Letter C");
        map.put("B","Letter B");
        map.put("E","Letter E");


        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry);
        }

        System.out.println(map.headMap("C",true));

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.ceilingEntry("C")); // Key and Value
        System.out.println(map.ceilingKey("C")); // Only Key

        System.out.println(map.higherEntry("C"));




    }
}
