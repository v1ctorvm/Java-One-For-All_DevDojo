package javaoneforall.javacore.ZZClambdas.test;

import javaoneforall.javacore.ZZClambdas.domain.Anime;
import javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    static void main() {

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Attack On Titan", 150), new Anime("One Piece", 900), new Anime("Naruto", 500)));

        AnimeComparators animeComparators = new AnimeComparators();
        animes.sort(animeComparators::compareByEpisodeNonStatic);
        animes.sort((a1,a2) -> animeComparators.compareByEpisodeNonStatic(a1,a2));
        System.out.println(animes);

    }
}
