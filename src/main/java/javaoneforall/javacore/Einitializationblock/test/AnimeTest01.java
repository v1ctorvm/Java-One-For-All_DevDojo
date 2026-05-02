package javaoneforall.javacore.Einitializationblock.test;

import javaoneforall.javacore.Einitializationblock.domain.Anime;

public class AnimeTest01 {
    static void main() {


        Anime anime = new Anime("One Piece");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }


    }

}
