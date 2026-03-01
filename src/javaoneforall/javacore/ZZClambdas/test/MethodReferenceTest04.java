package javaoneforall.javacore.ZZClambdas.test;

import javaoneforall.javacore.ZZClambdas.domain.Anime;
import javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    static void main() {

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Attack On Titan", 150), new Anime("One Piece", 900), new Anime("Naruto", 500)));

//        Supplier<AnimeComparators> animeComparatorsSupplier = () -> new AnimeComparators();
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        animes.sort(animeComparators::compareByEpisodeNonStatic);

        System.out.println(animes);

        // Com construtor (Title,Episodes), retorna um Anime)
//        BiFunction<String,Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String,Integer,Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Viland Saga",24));
    }
}
