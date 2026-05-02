package javaoneforall.javacore.Ycolletion.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    static void main() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

        // index 0,1,2,3
        // value 0,1,4,6

        // (-(insert point) -1)
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers,2));
        System.out.println(Collections.binarySearch(numbers,0));
        System.out.println(Collections.binarySearch(numbers,-1));

    }
}
