package javaoneforall.javacore.ZZJcrud.test;

import javaoneforall.javacore.ZZJcrud.service.AnimeService;
import javaoneforall.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {

    private static final Scanner SCANNER = new Scanner(System.in);


    static void main() {

        int op;
        while (true){
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;

            switch (op){
                case 1 -> {
                    producerMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    ProducerService.menu(op);
                }
                case 2 -> {
                    animeMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    AnimeService.menu(op);
                }
            }
        }
    }

    private static void menu(){
        System.out.println("""
                Type the number of your operation
                1 - Producer
                2 - Anime
                0 - Exit""");
    };

    private static void producerMenu(){
        System.out.println("""
                Type the number of your operation
                1 - Search for producer
                2 - Delete producer
                3 - Save producer
                4 - Update Producer
                9 - Go back""");
    }

    private static void animeMenu(){
        System.out.println("""
                Type the number of your operation
                1 - Search for anime
                2 - Delete anime
                3 - Save anime
                4 - Update anime
                9 - Go back""");
    }
}
