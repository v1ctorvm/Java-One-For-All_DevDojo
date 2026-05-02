package javaoneforall.javacore.ZZHdesignpatterns.test;

import javaoneforall.javacore.ZZHdesignpatterns.domain.Country;
import javaoneforall.javacore.ZZHdesignpatterns.domain.Currency;
import javaoneforall.javacore.ZZHdesignpatterns.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    static void main() {

        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());


    }
}
