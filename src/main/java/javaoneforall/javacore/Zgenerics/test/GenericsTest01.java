package javaoneforall.javacore.Zgenerics.test;

import javaoneforall.javacore.Ycolletion.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    static void main() {


        // Type Erasure
        List<String> list = new ArrayList<>();

        list.add("Midoriya");


        for (String o : list) {
            System.out.println(o);

        }

        add(list,new Customer("Jiraya"));

        for (Object o : list) {
            System.out.println(o);

        }

    }

    // Incrivelmente funciona adicionar na lista, ele adiciona sem se tocar no metodo, e so printa se for Objeto
    private static void add(List anylist, Customer c){
        anylist.add(c);
    }
}