package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    static void main() {


        List<Manga> mangas = new LinkedList<>();


        mangas.add(new Manga(1L,"Attack on titan",99.99,0));
        mangas.add(new Manga(5L,"Berserk",19.99,5));
        mangas.add(new Manga(3L,"Pokemon",39.99,0));
        mangas.add(new Manga(4L,"Naruto",5.99,8));
        mangas.add(new Manga(2L,"Dragon Ball Z",7.99,0));

//        for (Manga manga : mangas) {
//            if (manga.getQuantity() == 0) {
//                mangas.remove(manga);
//            }
//        }

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantity() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantity() == 0);

        System.out.println(mangas);

    }
}
