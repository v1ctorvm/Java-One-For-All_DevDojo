package javaoneforall.javacore.ZZEstreams.test;


import java.util.List;

// Reduce
public class StreamTest07 {
    static void main() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);


        // Sum
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0, (x, y) -> x + y));

        System.out.println(integers.stream()
                .reduce(0, Integer::sum));

        System.out.println("---------");

        // Multiply

        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(1, (x, y) -> x * y));


        System.out.println("---------");
        // Max

       integers.stream()
                .reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0,Integer::max));


    }
}
