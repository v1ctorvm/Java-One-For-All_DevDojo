package javaoneforall.javacore.Zgenerics.test;

import javaoneforall.javacore.Zgenerics.domain.Boat;
import javaoneforall.javacore.Zgenerics.domain.Car;
import javaoneforall.javacore.Zgenerics.service.BoatRentalService;
import javaoneforall.javacore.Zgenerics.service.CarRentalService;

public class GenericClassesTest02 {
    static void main() {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvaliableBoat();
        System.out.println("Using the car for an entire month");
        boatRentalService.returnRentBoat(boat);
    }
}
