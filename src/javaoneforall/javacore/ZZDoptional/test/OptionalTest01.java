package javaoneforall.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    static void main() {
        Optional<String> o1 = Optional.of("Hello Victor");
        System.out.println(o1);
        String name2 = "Test";

        Optional<String> o2 = Optional.of(name2);
        System.out.println(o2);

        // When you don't know if is null, or exist
        Optional<String> o3 = Optional.ofNullable(null);
        System.out.println(o3);

//        Optional<String> o4 = Optional.of(null); null pointer exception
//        System.out.println(o4);

        System.out.println("--------");

        Optional<String> name = findName("victor");
        System.out.println(name.orElse("EMPTY NAME"));
        name.ifPresent(s -> System.out.println(s.toUpperCase()));

        findName("java").orElseThrow(IllegalArgumentException::new);

    }


    private static Optional<String> findName(String name) {
        List<String> strings = List.of("Victor", "Java");

        int i = strings.indexOf(name);
        if (i != -1) {
            return Optional.of(strings.get(i));
        }
        return Optional.empty();
    }

}
