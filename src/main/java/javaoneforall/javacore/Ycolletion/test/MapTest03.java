package javaoneforall.javacore.Ycolletion.test;

import javaoneforall.javacore.Ycolletion.domain.Customer;
import javaoneforall.javacore.Ycolletion.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    static void main() {

        Customer customer1 = new Customer("Victor Matheus");
        Customer customer2 = new Customer("v1ctorvm");


        Manga manga1 = new Manga(1L, "Attack on titan", 99.99);
        Manga manga2 = new Manga(5L, "Berserk", 19.99);
        Manga manga3 = new Manga(3L, "Pokemon", 39.99);
        Manga manga4 = new Manga(4L, "Naruto", 5.99);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 7.99);

        Map<Customer, List<Manga>> customerMangaMap = new HashMap<>();
        List<Manga> mangaCustomer1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaCustomer2List = List.of(manga2, manga5, manga4);
        customerMangaMap.put(customer1, mangaCustomer1List);
        customerMangaMap.put(customer2, mangaCustomer2List);

        for (Map.Entry<Customer, List<Manga>> entry : customerMangaMap.entrySet()) {
            System.out.print("Nome Cliente: " + entry.getKey().getName() +" | Mangas Comprados: ");
            for (Manga manga : entry.getValue()){
                System.out.print(manga.getTittle() + ", ");
            }
            System.out.println();
        }
    }
}
