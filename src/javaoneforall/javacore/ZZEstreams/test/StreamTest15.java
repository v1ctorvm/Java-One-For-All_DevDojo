package javaoneforall.javacore.ZZEstreams.test;

import javaoneforall.javacore.ZZEstreams.domain.Category;
import javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import javaoneforall.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static javaoneforall.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static javaoneforall.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;

public class StreamTest15 {
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

        // Get Category Statistics (Min, Max, Avg, Sum)
        Map<Category, DoubleSummaryStatistics> collect = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Map<Category, Set<Promotion>> Fantasy - UNDER_PROMOTION, no NORMAL_PRICE
        Map<Category, Set<Promotion>> collect1 = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory,
                mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory,
                mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);


    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }

}
