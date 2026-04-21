package javaoneforall.javacore.ZZHdesignpatterns.test;

import javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    static void main() {

        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
        AircraftTest01.bookSeat("1A");


    }

    static void bookSeat(String seat) {
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft);
        System.out.println(aircraft.bookSeat(seat));
    }
}
