package javaoneforall.javacore.ZZClambdas.test;

import javaoneforall.javacore.ZZClambdas.domain.Anime;
import javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    static void main() {


        List<Anime> animes = new ArrayList<>(List.of(new Anime("Attack On Titan", 150), new Anime("One Piece", 900), new Anime("Naruto", 500)));
//        animes.sort((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animes.sort(AnimeComparators::compareByTittle);
        animes.sort(AnimeComparators::compareByEpisode);
        System.out.println(animes);


    }
}
