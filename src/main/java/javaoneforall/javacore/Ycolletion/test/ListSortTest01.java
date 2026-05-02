package javaoneforall.javacore.Ycolletion.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main() {

        List<String> mangas = new ArrayList<>();
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        System.out.println(mangas);

        Collections.sort(mangas); // Arrumado de A-Z a-z
        System.out.println(mangas);

        List<Double> values = new ArrayList<>();
        values.add(110.21);
        values.add(141.4);
        values.add(1.0);
        values.add(11D);
        System.out.println(values);

        Collections.sort(values);
        System.out.println(values);


    }
}
