package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Customer;
import javaoneforall.javacore.Ycolletion.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main() {

        Customer customer1 = new Customer("Victor Matheus");
        Customer customer2 = new Customer("v1ctorvm");


        Manga manga1 = new Manga(1L, "Attack on titan", 99.99);
        Manga manga2 = new Manga(5L, "Berserk", 19.99);
        Manga manga3 = new Manga(3L, "Pokemon", 39.99);
        Manga manga4 = new Manga(4L, "Naruto", 5.99);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 7.99);

        Map<Customer, Manga> customerMangaMap = new HashMap<>();
        customerMangaMap.put(customer1, manga1); // Customer by one Manga
        customerMangaMap.put(customer2, manga5);

        for (Map.Entry<Customer, Manga> entry : customerMangaMap.entrySet()) {
            System.out.println("Cliente: " + entry.getKey().getName() + " - " + entry.getValue().getTittle());
        }
    }
}
