package javaoneforall.javacore.ZZBParameterization.test;

import javaoneforall.javacore.ZZBParameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterizationTest01 {
    private static List<Car> cars = List.of(new Car("Green",2011),new Car("Black",1998),new Car("Red",2019));


    static void main() {
        List<Car> filterGreenCar = filterGreenCar(cars);
        System.out.println(filterGreenCar);
        System.out.println(filterCarByColor(cars,"red"));
        System.out.println(filterCarByColor(cars,"green"));
        System.out.println(filterCarByColor(cars,"black"));



    }

    private static List<Car> filterGreenCar(List<Car> carsList){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carsList){
            if (car.getColor().strip().equalsIgnoreCase("green")){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterRedCar(List<Car> carsList){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carsList){
            if (car.getColor().strip().equalsIgnoreCase("red")){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarByColor(List<Car> carsList,String color){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carsList){
            if (car.getColor().strip().equalsIgnoreCase(color)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
