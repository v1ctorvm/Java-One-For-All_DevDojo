package javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    static void main() {

        List<String> words = List.of("Gomu","Gomu","No","Mi");

        String[] split = words.get(0).split("");
        System.out.println(Arrays.toString(split));
//        Stream<String> stream = Arrays.stream(split);


        List<String> collect = words.stream()
                .map(w -> w.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String> | Stream<Stream<String>>
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
