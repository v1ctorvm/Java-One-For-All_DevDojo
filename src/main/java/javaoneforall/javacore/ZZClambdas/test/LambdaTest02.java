package javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    static void main() {

        List<String> strings = List.of("Victor", "Matheus", "Paim", "Callescura");
        List<Integer> integers = map(strings, String::length);
        System.out.println(integers);
        List<String> upperCases = map(strings, String::toUpperCase);
        System.out.println(upperCases);
        List<String> teste = map(strings, s -> String.valueOf(s.toLowerCase().contains("v")));
        System.out.println(teste);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }


}
