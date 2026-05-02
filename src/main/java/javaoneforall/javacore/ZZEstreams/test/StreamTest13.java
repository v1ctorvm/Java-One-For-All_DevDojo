package javaoneforall.javacore.ZZEstreams.test;

import javaoneforall.javacore.ZZEstreams.domain.Category;
import javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import javaoneforall.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static javaoneforall.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static javaoneforall.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;

public class StreamTest13 {
    private static final List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 6.99, Category.FANTASY),
            new LightNovel("Kumo desugat", 1.99, Category.FANTASY),
            new LightNovel("Kumo desugat", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.0, Category.ROMANCE)
    ));

    static void main() {
        Map<Promotion, List<LightNovel>> collect = lightNovelList.stream().collect(groupingBy(StreamTest13::getPromotion));

        System.out.println(collect);

        // Group Twice,Category and Promotion
        // Map < Category, Map<Promotion, List<Lightnovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        groupingBy(
                                StreamTest13::getPromotion
                        )));

        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
