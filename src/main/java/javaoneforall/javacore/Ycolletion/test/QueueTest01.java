package javaoneforall.javacore.Ycolletion.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    static void main() {


        Queue<String> queue = new PriorityQueue<>(); // Deve ter um objeto Comparable

        queue.add("C");
        queue.add("A");
        queue.add("B");

        for (String s : queue) {
            System.out.println(s);
        }

//        System.out.println(queue.peek()); // Pega o primeiro valor da Lista
//        System.out.println(queue.poll()); // Remove o valor da lista com principio de FIFO
//        System.out.println(queue.remove()); // Mesma coisa que poll, mas se estiver vazia retorna Exeption
//        System.out.println(queue.offer("e")); // Se a queue tiver limite, metodo retorna true or false se foi adicionado

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
        }


    }
}
