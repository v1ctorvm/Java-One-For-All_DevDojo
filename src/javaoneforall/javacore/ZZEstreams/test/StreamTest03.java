package javaoneforall.javacore.ZZEstreams.test;

import javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no Life", 3.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desugat", 1.99),
            new LightNovel("Kumo desugat", 1.99),
            new LightNovel("Monogatari", 4.0)
    ));


    static void main() {
        Stream<LightNovel> stream = lightNovelList.stream();
        lightNovelList.forEach(System.out::println);

        long count = stream.distinct().filter(ln -> ln.getPrice() <= 4)
                .count();


        System.out.println(count);


    }
}
