package javaoneforall.javacore.Zgenerics.service;

import javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {

private List<T> objetctsAvaliable;

    public RentalService(List<T> objetctsAvaliable) {
        this.objetctsAvaliable = objetctsAvaliable;
    }

    public T retrieveAvaliableObjetct(){
        System.out.println("Searching for any objetct available");
        T t = objetctsAvaliable.remove(0);
        System.out.println("Renting the object: " + t);
        System.out.println("Availeble objects to rent: " + objetctsAvaliable);
        return t;
    }

    public void returnRentObject(T t){
        System.out.println("Returning object: " + t);

        objetctsAvaliable.add(t);

        System.out.println("Available objects to rent: " +  objetctsAvaliable) ;
    }
}
