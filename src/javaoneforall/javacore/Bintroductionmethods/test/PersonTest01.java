package javaoneforall.javacore.Bintroductionmethods.test;

import javaoneforall.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    static void main() {
        Person person = new Person();
//        person.name = "Victor";
//        person.age = 18;
        person.setName("Jiraya");
        person.setAge(70);
        person.print();

        person.getName();
        person.getAge();
        System.out.println(person.getName());
        System.out.println(person.getAge());


    }
}
