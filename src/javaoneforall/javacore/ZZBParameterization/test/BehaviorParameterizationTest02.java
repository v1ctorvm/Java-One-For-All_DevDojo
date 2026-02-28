package javaoneforall.javacore.ZZBParameterization.test;

import javaoneforall.javacore.ZZBParameterization.domain.Car;
import javaoneforall.javacore.ZZBParameterization.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest02 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));


    static void main() {

        List<Car> green = filter(cars, car -> car.getColor().equalsIgnoreCase("green"));

        List<Car> red = filter(cars,car -> car.getColor().equalsIgnoreCase("red"));

        List<Car> yearBefore = filter(cars,car -> car.getYear() < 2015);

        System.out.println("green = " + green);
        System.out.println(red);
        System.out.println(yearBefore);

    }

    private static List<Car> filter(List<Car> carsList, Predicate<Car> predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carsList) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}

