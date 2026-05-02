package javaoneforall.javacore.Zgenerics.test;

import javaoneforall.javacore.Zgenerics.domain.Boat;
import javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.List;

public class GenericMethodsTest01 {
    static void main() {

        List<Boat> boatList = createArrayWithOneAtObjetc(new Boat("Big Boat"));
//        boatList.add()




    }

    private static <T> List<T> createArrayWithOneAtObjetc(T t){
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> createArrayWithOneAtObjetc(T t){
//        return List.of(t);
//    }

}
