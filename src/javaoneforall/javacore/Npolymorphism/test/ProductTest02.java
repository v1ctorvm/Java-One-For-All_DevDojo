package javaoneforall.javacore.Npolymorphism.test;

import javaoneforall.javacore.Npolymorphism.domain.Computer;
import javaoneforall.javacore.Npolymorphism.domain.Product;
import javaoneforall.javacore.Npolymorphism.domain.Tomato;
import javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest02 {
    static void main() {

        Product computer = new Computer("IMAC M4", 2000);
        Tomato tomato = new Tomato("Italian", 5);

        tomato.setBestConsumedBefore("11/21/2025");

    }
}
