package javaoneforall.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    static void main() {


        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Jose Vitor", "Ghisi", "Reolon");
        List<String> developers = List.of("Victor Matheus", "Daniel");
        List<String> students = List.of("Edipo", "Gustavo Lima", "Roberto Carlos");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
