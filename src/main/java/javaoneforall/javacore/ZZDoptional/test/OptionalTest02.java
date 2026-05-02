package javaoneforall.javacore.ZZDoptional.test;

import javaoneforall.javacore.ZZDoptional.domain.Manga;
import javaoneforall.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    static void main() {

        Optional<Manga> mangaByTittle = MangaRepository.findByTittle("Boku no hero");
        mangaByTittle.ifPresent(m -> m.setTitle("Boku no Hero 5"));
        System.out.println(mangaByTittle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);


        Manga newManga = MangaRepository.findByTittle("Attack On Titan")
                .orElse(new Manga(3, "Attack On Titan", 150));


        System.out.println(newManga);
    }

}
