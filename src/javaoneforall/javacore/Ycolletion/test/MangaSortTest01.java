package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByTittleComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getTittle().compareTo(manga2.getTittle());
    }

}

public class MangaSortTest01 {
    static void main() {

        List<Manga> mangas = new ArrayList<>(6);

        System.out.println("---- Normal ----");
        mangas.add(new Manga(1L,"Attack on titan",99.99));
        mangas.add(new Manga(5L,"Berserk",19.99));
        mangas.add(new Manga(3L,"Pokemon",39.99));
        mangas.add(new Manga(4L,"Naruto",5.99));
        mangas.add(new Manga(2L,"Dragon Ball Z",7.99));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---- Price ----");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---- Tittle ----");
//        Collections.sort(mangas,new MangaByTittleComparator());
        mangas.sort(new MangaByTittleComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
