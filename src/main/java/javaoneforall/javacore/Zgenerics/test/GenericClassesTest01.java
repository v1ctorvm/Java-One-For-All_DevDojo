package javaoneforall.javacore.Zgenerics.test;

import javaoneforall.javacore.Zgenerics.domain.Car;
import javaoneforall.javacore.Zgenerics.service.CarRentalService;

public class GenericClassesTest01 {
    static void main() {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvaliableCar();
        System.out.println("Using the car for an entire month");
        carRentalService.returnRentCar(car);
    }
}
