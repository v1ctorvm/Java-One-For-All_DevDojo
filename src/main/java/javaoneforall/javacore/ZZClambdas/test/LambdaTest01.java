package javaoneforall.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    static void main() {

        List<String> stringList = List.of("Willian", "Victor", "Italiano");
        List<Integer> numbers = List.of(1, 2, 3, 4);
        forEach(stringList, (String s) -> System.out.print(s + " "));
        forEach(numbers, (Integer i) -> System.out.print(i + " "));


    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
