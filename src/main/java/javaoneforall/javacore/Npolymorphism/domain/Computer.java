package javaoneforall.javacore.Npolymorphism.domain;

public class Computer extends Product{

    public static final double TAX_PERCENTAGE = 0.21;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating TAX VALUE for Computer");
        return this.price * TAX_PERCENTAGE;
    }
}
