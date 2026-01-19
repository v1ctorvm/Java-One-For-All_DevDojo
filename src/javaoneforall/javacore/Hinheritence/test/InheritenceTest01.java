package javaoneforall.javacore.Hinheritence.test;

import javaoneforall.javacore.Hinheritence.domain.Adress;
import javaoneforall.javacore.Hinheritence.domain.Employee;
import javaoneforall.javacore.Hinheritence.domain.Manager;

public class InheritenceTest01 {
    static void main() {

        Adress adress = new Adress();
        adress.setSreet("12th Av");
        adress.setZipcode("13245");

        Employee employee = new Employee("Toyohisa Shimazu");
        employee.setSociaSecurityNumber("13123213");
        employee.setSalary(12000);
        employee.setAdress(adress);

        employee.print();

        System.out.println("--------------");
        Manager manager = new Manager("Oda Nobunaga");
        manager.setSociaSecurityNumber("52324324");
        manager.setSalary(25000);
        manager.setAdress(adress);
        manager.setDepartment("IT");
        manager.print();


    }
}
