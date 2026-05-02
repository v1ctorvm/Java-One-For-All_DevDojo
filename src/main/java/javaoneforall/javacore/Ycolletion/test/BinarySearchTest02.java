package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main() {
        MangaByTittleComparator MangaByTittleComparator = new MangaByTittleComparator();

        List<Manga> mangas = new ArrayList<>(6);

        System.out.println("---- Normal ----");
        mangas.add(new Manga(1L,"Attack on titan",99.99));
        mangas.add(new Manga(5L,"Berserk",19.99));
        mangas.add(new Manga(3L,"Pokemon",39.99));
        mangas.add(new Manga(4L,"Naruto",5.99));
        mangas.add(new Manga(2L,"Dragon Ball Z",7.99));

        mangas.sort(MangaByTittleComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L,"Dragon Ball Z",9.99);

        System.out.println(Collections.binarySearch(mangas,mangaToSearch,MangaByTittleComparator));



    }
}
