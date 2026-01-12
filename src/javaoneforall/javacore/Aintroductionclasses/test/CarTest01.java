package javaoneforall.javacore.Aintroductionclasses.test;

import javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    static void main() {

        Car car01 = new Car();
        car01.name = "Ferrari";
        car01.model = "Enzo";
        car01.year = 2007;

        Car car02 = new Car();
        car02.name = "Mustang";
        car02.model = "GT 500";
        car02.year = 1968;

       //car01 = car02;

        System.out.println("Car: " + car01.name + " | Model: " + car01.model +  " | Year: " + car01.year);
        System.out.println("Car: " + car02.name + " | Model: " + car02.model +  " | Year: " + car02.year);



    }
}
