package javaoneforall.javacore.ZZHdesignpatterns.test;

import javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonEnum;
import javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonEnumTest01 {
    static void main() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonEnum.INTANCE.hashCode());
        System.out.println(AircraftSingletonEnum.INTANCE.hashCode());


    }

    static void bookSeat(String seat) {
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INTANCE;
        System.out.println(aircraft.hashCode() );
        System.out.println(aircraft.bookSeat(seat));
    }
}
