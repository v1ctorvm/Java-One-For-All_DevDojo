package javaoneforall.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTest02 {
    static void main() {

        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        List<Animal> animals = new ArrayList<>(2);
        printConsult(animals);
        printConsult(dogs);
        printConsult(cats);
    }

    private static void printConsult(List<? extends Animal> animals) {
        System.out.println("---------------");
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    private static void printConsultDog(List<? super Dog> animals) {
        System.out.println("---------------");
        for (Object obj : animals) {
            if (obj instanceof Dog){
                Dog d = (Dog) obj;
                d.consult();
            }
        }
    }
}
