package javaoneforall.javacore.ZZEstreams.test;

import javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


// 1 Order by title
// 2 Retrieve thw first 3 tittles with price less than 4
public class StreamsTest01 {
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
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovelList);
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }
        System.out.println("titles = " + titles);

    }
}
