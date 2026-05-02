package javaoneforall.javacore.ZZHdesignpatterns.test;

import javaoneforall.javacore.ZZHdesignpatterns.domain.*;
import javaoneforall.javacore.ZZHdesignpatterns.dto.ReportDTO;

public class DataTransferObjectTest01 {
    static void main() {
        Aircraft aircraft = new Aircraft("777");
        Country brazil = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(brazil);
        Person build = Person.PersonBuilder.builder().name("Victor").build();

        ReportDTO build1 = ReportDTO.ReportDTOBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(brazil)
                .currency(currency)
                .personName(build.getName())
                .build();


        System.out.println(build1);
    }
}
