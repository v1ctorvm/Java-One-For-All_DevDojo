package javaoneforall.javacore.Fstaticmodifier.test;

import javaoneforall.javacore.Fstaticmodifier.domain.Car;

public class CarTest01 {
    static void main() {
        System.out.println(Car.getSpeedLimit());

        Car car1 = new Car("BMW", 270);
        Car car2 = new Car("Mercedes", 285);
        Car car3 = new Car("Audi", 255);

        car1.print();
        Car.setSpeedLimit(180);
        car2.print();
        car3.print();




    }
}
