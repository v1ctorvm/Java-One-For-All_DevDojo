package javaoneforall.javacore.ZZBParameterization.test;

import javaoneforall.javacore.ZZBParameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest03 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));


    static void main() {

        List<Car> green = filter(cars, car -> car.getColor().equalsIgnoreCase("green"));

        List<Car> red = filter(cars,car -> car.getColor().equalsIgnoreCase("red"));

        List<Car> yearBefore = filter(cars,car -> car.getYear() < 2015);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println("green = " + green);
        System.out.println(red);
        System.out.println(yearBefore);
        System.out.println(filter(numbers, num -> num % 2 == 0)); // So adiciona na lista, se for verdadeiro
        System.out.println(filter(numbers, num -> num == 2));


    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();

        for (T e : list){
            if (predicate.test(e)){
                filtered.add(e);
            }
        }
        return filtered;
    }
}

