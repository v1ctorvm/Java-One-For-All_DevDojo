package javaoneforall.javacore.Npolymorphism.service;

import javaoneforall.javacore.Npolymorphism.domain.Product;
import javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {

    public static void generateTaxReport(Product product){
        System.out.println("Starting the TAX REPORT");
        double taxValue = product.calculateTaxValue();
        System.out.println("Produt: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax Value: " + taxValue);
        System.out.println(((Tomato) product).getBestConsumedBefore());
    }
}
