package javaoneforall.javacore.ZZDoptional.repository;

import javaoneforall.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {

    private static List<Manga> mangas = List.of(new Manga(1, "Boku no hero", 50), new Manga(2, "Overlord", 25));

    public static Optional<Manga> findByTittle(String title) {
        return findBy(manga -> manga.getTitle().equals(title));

    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(manga -> manga.getID().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }



}
