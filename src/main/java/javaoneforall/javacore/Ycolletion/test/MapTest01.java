package javaoneforall.javacore.Ycolletion.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    static void main() {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("keuboard", "keyboard");
        map.put("mousw", "mouse");
        map.put("yoi", "you");
        map.putIfAbsent("yoi2", "you22"); // Somente se o valor estiver ausente, adiciona
        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("------");

        for (String values : map.values()){
            System.out.println(values);
        }

        System.out.println("------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.println(entry);
        }


    }
}
