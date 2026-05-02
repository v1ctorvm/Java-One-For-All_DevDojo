package javaoneforall.javacore.Jfinalmodifier.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer();


    public final void print(){
        System.out.println("Car name: " + this.name);
    }

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
