package javaoneforall.javacore.Kenum.test;

import javaoneforall.javacore.Kenum.domain.Customer;
import javaoneforall.javacore.Kenum.domain.Customer.PaymentType;
import javaoneforall.javacore.Kenum.domain.CustomerType;

public class CustomerTest01 {
    static void main() {

        Customer customer1 = new Customer("Tsunade", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Jiraya",CustomerType.COMPANY,PaymentType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
