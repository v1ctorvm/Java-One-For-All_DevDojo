package javaoneforall.javacore.ZZEstreams.test;

import javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// 1 Order by title
// 2 Retrieve thw first 3 tittles with price less than 4
public class StreamsTest02 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Overlord",3.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("No game no Life",3.99),
            new LightNovel("Fullmetal Alchemist",6.99),
            new LightNovel("Kumo desugat",1.99),
            new LightNovel("Monogatari", 4.0)
    ));

    static void main() {

        List<String> titles = lightNovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);

    }
}
