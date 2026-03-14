package javaoneforall.javacore.ZZEstreams.test;

import javaoneforall.javacore.ZZEstreams.domain.Category;
import javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99,Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99,Category.DRAMA),
            new LightNovel("No game no Life", 2.99,Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 6.99,Category.FANTASY),
            new LightNovel("Kumo desugat", 1.99,Category.FANTASY),
            new LightNovel("Kumo desugat", 1.99,Category.FANTASY),
            new LightNovel("Monogatari", 4.0,Category.ROMANCE)
    ));

    static void main() {
        Map<Category,List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovelList) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel);break;
                case FANTASY: fantasy.add(lightNovel);break;
                case ROMANCE: romance.add(lightNovel);break;
            }
        }

        categoryListMap.put(Category.DRAMA,drama);
        categoryListMap.put(Category.ROMANCE,romance);
        categoryListMap.put(Category.FANTASY,fantasy);

        System.out.println(categoryListMap);

        Map<Category, List<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println("collect = " + collect);

    }
}
