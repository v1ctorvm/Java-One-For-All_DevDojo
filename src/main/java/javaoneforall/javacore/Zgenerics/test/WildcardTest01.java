package javaoneforall.javacore.Zgenerics.test;


abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal{

    @Override
    public void consult() {
        System.out.println("Consulting Dogs");
    }
}

class Cat extends Animal{

    @Override
    public void consult() {
        System.out.println("Consulting Cats");
    }
}

public class WildcardTest01 {
    static void main() {

        Dog[] dogs = {new Dog(),new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsult(dogs);
        printConsult(cats);



    }

    private static void printConsult(Animal[] animals){
        System.out.println("---------------");
        for (Animal animal : animals) {
            animal.consult();
        }


    }
}
