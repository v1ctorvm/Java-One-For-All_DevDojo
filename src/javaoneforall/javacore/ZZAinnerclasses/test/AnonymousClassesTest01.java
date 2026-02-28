package javaoneforall.javacore.ZZAinnerclasses.test;

class Animal {
    public void walk(){
        System.out.println("Animal Walking");
    }
}

class Dog extends Animal{
    @Override
    public void walk() {
        System.out.println("Dog Walking");
    }
}

public class AnonymousClassesTest01 {
    static void main() {

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Something is walking");
            }
        };
        animal.walk();



    }
}
