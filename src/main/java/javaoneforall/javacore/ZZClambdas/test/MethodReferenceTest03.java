package javaoneforall.javacore.ZZClambdas.test;

import javaoneforall.javacore.ZZClambdas.domain.Anime;
import javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    static void main() {

        List<String> names = new ArrayList<>(List.of("Eren","Mikasa","Armin"));
        names.sort(String::compareTo);
        System.out.println("names = " + names);

        Function<String,Integer> numToStringInteger = Integer::parseInt;
        Integer apply = numToStringInteger.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names,"Eren"));
    }
}
