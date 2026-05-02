package javaoneforall.javacore.ZZBParameterization.interfaces;

import javaoneforall.javacore.ZZBParameterization.domain.Car;

@FunctionalInterface // Apenas com 1 abstrato Metodo
public interface CarPredicate {
    boolean test(Car car);
    // (Parameters) -> <Expression>
    // (Car car) -> car.getColor().equals("green")
}