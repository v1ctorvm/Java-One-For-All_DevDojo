package javaoneforall.javacore.Labastractclasses.test;

import javaoneforall.javacore.Labastractclasses.domain.Developer;
import javaoneforall.javacore.Labastractclasses.domain.Manager;

public class EmployeeTest01 {
    static void main() {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Zoro",12000.);

        System.out.println(manager);
        System.out.println(developer);



    }
}
