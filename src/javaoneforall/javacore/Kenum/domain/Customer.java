package javaoneforall.javacore.Kenum.domain;

public class Customer {
    public enum PaymentType {
        DEBIT, CREDIT
    }

    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType) {
        this.name = name;
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", CustomerType=" + customerType.REPORT_VALUE +
                ", CustomerTypeDataBateValue=" + customerType.DB_VALUE +
                ", paymentType=" + paymentType +
                '}';
    }

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }
}
