package javaoneforall.javacore.ZZJcrud.service;

import javaoneforall.javacore.ZZJcrud.domain.Anime;
import javaoneforall.javacore.ZZJcrud.domain.Producer;
import javaoneforall.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op){
        switch (op){
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();

        }
    }

    private static void findByName() {
        System.out.print("Type the name or empty to list all: ");
        List<Anime> animes = AnimeRepository.findByName(SCANNER.nextLine());

        animes.forEach(a-> System.out.printf("[%d] - %s %d %d %n", a.getId(),a.getName(),a.getEpisodes(),a.getProducer().getId()));
    }

    private static void delete(){
        System.out.println("Type the id of anime you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Are you sure [Y/N]: ");
        String choice = SCANNER.nextLine();

        if ("y".equalsIgnoreCase(choice)){
            AnimeRepository.delete(id);
        }
    }

    private static void save(){
        System.out.println("Type the name of anime: ");
        String name = SCANNER.nextLine();

        System.out.println("Type the number of episodes: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Type the id of producer: ");
        int producerId = Integer.parseInt(SCANNER.nextLine());

        Anime build = Anime.builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build())
                .build();

        AnimeRepository.save(build);
    }

    private static void update(){
        System.out.println("Type the id od the object you want to update: ");
        Optional<Anime> anime = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));

        if (anime.isEmpty()){
            System.out.println("Anime not found");
            return;
        }

        Anime animeFromDataBase = anime.get();
        System.out.println("Anime found " + animeFromDataBase);
        System.out.println("Type the new name or enter to keep the same:");
        String name = SCANNER.nextLine();

        name = name.isEmpty() ? animeFromDataBase.getName() : name;

        System.out.println("Type the number of episodes: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDataBase.getId())
                .name(name)
                .episodes(episodes)
                .producer(animeFromDataBase.getProducer())
                .build();

        AnimeRepository.update(animeToUpdate);
    }

}
