package javaoneforall.javacore.Cmethodoverloading.test;

import javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    static void main() {

        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",12,"Finished");
        anime.setName("Akudama Drive");
        anime.setType("TV");
        anime.setEpisodes(12);
        anime.print();


    }
}
