package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    static void main() {

        Set<Manga> mangas = new LinkedHashSet<>(); // LinkedHash nao duplica valor, e ordena conforme ordem de incersao
//        Set<Manga> mangas = new HashSet<>();  Hash, nao duplica valor, e ordena conforme setado Hash na Classe

        mangas.add(new Manga(1L,"Attack on titan",99.99,0));
        mangas.add(new Manga(5L,"Berserk",19.99,5));
        mangas.add(new Manga(3L,"Pokemon",39.99,0));
        mangas.add(new Manga(4L,"Naruto",5.99,8));
        mangas.add(new Manga(2L,"Dragon Ball Z",7.99,0));
        mangas.add(new Manga(2L,"Dragon Ball Z",7.99,0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }


    }
}
