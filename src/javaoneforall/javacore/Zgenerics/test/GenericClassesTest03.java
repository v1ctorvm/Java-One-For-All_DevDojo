package javaoneforall.javacore.Zgenerics.test;

import javaoneforall.javacore.Zgenerics.domain.Boat;
import javaoneforall.javacore.Zgenerics.domain.Car;
import javaoneforall.javacore.Zgenerics.service.BoatRentalService;
import javaoneforall.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    static void main() {
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"),new Boat("Boat 2")));
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("Ford Mustang"),new Car("Mercedes AMG")));

        RentalService<Car> rentalServiceCar = new RentalService<>(carsAvailable);
        Car car = rentalServiceCar.retrieveAvaliableObjetct();
        System.out.println("Using car for a month");
        rentalServiceCar.returnRentObject(car);

        System.out.println("----------");
        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatsAvailable);
        Boat boat = rentalServiceBoat.retrieveAvaliableObjetct();
        System.out.println("Using car for a month");
        rentalServiceBoat.returnRentObject(boat);
    }
}
