package javaoneforall.javacore.ZZEstreams.test;

import javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no Life", 3.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desugat", 1.99),
            new LightNovel("Kumo desugat", 1.99),
            new LightNovel("Monogatari", 4.0)
    ));


    static void main() {

        System.out.println(lightNovelList.stream().anyMatch(ln -> ln.getPrice() > 7)); // One or more
        System.out.println(lightNovelList.stream().allMatch(ln -> ln.getPrice() > 3)); // All the prices
        System.out.println(lightNovelList.stream().noneMatch(ln -> ln.getPrice() < 0)); // Non of then

        // Filtrar por condicao
        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);


        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);


    }
}
