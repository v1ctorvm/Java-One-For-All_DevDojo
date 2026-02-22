package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Manga;

import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class QueueTest02 {
    static void main() {


        Queue<Manga> queue = new PriorityQueue<>(new MangaPriceCompartor().reversed()); // Deve ter um objeto Comparable


        queue.add(new Manga(1L, "Attack on titan", 99.99, 0));
        queue.add(new Manga(5L, "Berserk", 19.99, 5));
        queue.add(new Manga(3L, "Pokemon", 39.99, 0));
        queue.add(new Manga(4L, "Naruto", 5.99, 8));
        queue.add(new Manga(2L, "Dragon Ball Z", 7.99, 0));
        queue.add(new Manga(10L, "Slime", 0.99, 0));


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


    }
}
