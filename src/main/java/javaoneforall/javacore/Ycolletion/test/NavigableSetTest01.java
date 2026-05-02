package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Manga;
import javaoneforall.javacore.Ycolletion.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class MangaPriceCompartor implements Comparator<Manga> {


    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    static void main() {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());    // Mantem aordem dos elementos em toda incersao
        set.add(new Smartphone("1111", "LG"));
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceCompartor());

        mangas.add(new Manga(1L, "Attack on titan", 99.99, 0));
        mangas.add(new Manga(5L, "Berserk", 19.99, 5));
        mangas.add(new Manga(3L, "Pokemon", 39.99, 0));
        mangas.add(new Manga(4L, "Naruto", 5.99, 8));
        mangas.add(new Manga(2L, "Dragon Ball Z", 7.99, 0));
        mangas.add(new Manga(10L, "Slime", 0.99, 0));



        // mangas.descendingSet - Ordena do maior pro menor



        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga); // Orderado pelo compareTo (setado na classe Manga) (ou setado na lista"MangaPriceCompartor)
        }
        Manga yuyuHakusho = new Manga(10L, "Yuyu Hakusho", 2.99, 0);

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("---------");
        System.out.println(mangas.lower(yuyuHakusho)); // Printa qual Manga tem o valor menor do que o ordenado
        System.out.println(mangas.floor(yuyuHakusho)); // Printa qual Manga tem o valor menor ou igual (ordenacao preco)
        System.out.println(mangas.higher(yuyuHakusho));
        System.out.println(mangas.ceiling(yuyuHakusho));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // retira o primeiro da lista
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); // retira o ultimo da lista
        // Ordenados pelo criterio escolhido, compareTo ou compare overloaded



    }
}
