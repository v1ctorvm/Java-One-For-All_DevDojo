package javaoneforall.javacore.ZZAinnerclasses.test;



import javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CarTitleComparator implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonumousClassesTest02 {
    static void main() {

        List<Car> cars = new ArrayList<>(List.of(new Car("Volvo"), new Car("Audi")));
        cars.sort(new Comparator<Car>(){

            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        System.out.println(cars);


    }
}
