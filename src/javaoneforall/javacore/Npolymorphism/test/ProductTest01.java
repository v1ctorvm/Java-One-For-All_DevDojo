package javaoneforall.javacore.Npolymorphism.test;

import javaoneforall.javacore.Npolymorphism.domain.Computer;
import javaoneforall.javacore.Npolymorphism.domain.Tomato;
import javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    static void main() {

        Computer computer = new Computer("IMAC M4", 2000);
        Tomato tomato = new Tomato("Italian", 5);

        ProductTaxReportService.generateTaxReport(computer);
        System.out.println("-------------");
        ProductTaxReportService.generateTaxReport(tomato);

        ProductTaxReportService.generateTaxReport(computer);

    }
}
