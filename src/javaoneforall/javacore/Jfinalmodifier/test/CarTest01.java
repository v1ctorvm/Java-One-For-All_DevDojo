package javaoneforall.javacore.Jfinalmodifier.test;

import javaoneforall.javacore.Jfinalmodifier.domain.Buyer;
import javaoneforall.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    static void main() {

        Car car1 = new Car("Mustang");
        System.out.println(Car.SPEED_LIMIT);

        System.out.println(car1.BUYER);

        car1.BUYER.setName("Kuririn");
        System.out.println(car1.BUYER);

    }
}
