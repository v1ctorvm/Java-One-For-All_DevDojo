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

public class StreamTest14 {
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
        // Filter by Category Count or Get Highest Price of Category

        // Category Count
        Map<Category, Long> countPerCategory = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(countPerCategory);

        Map<Category, Optional<LightNovel>> getMaxPriceEachCategory = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(getMaxPriceEachCategory);

        Map<Category, LightNovel> getMaxPriceEachCategoryCollect = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory,
                collectingAndThen(maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(getMaxPriceEachCategoryCollect);

        Map<Category, LightNovel> getMaxPriceEachCategoryToMap = lightNovelList.stream().collect(toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(getMaxPriceEachCategoryToMap);
    }

}
