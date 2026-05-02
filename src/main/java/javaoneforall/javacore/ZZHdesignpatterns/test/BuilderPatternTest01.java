package javaoneforall.javacore.ZZHdesignpatterns.test;

import javaoneforall.javacore.ZZHdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    static void main() {

        Person person = Person.PersonBuilder
                .builder()
                .name("Victor")
                .lastName("Matheus")
                .userName("v1ctor")
                .email("v1ctor@gmail.com")
                .build();

        System.out.println(person);
    }

}
