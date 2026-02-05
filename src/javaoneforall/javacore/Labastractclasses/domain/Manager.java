package javaoneforall.javacore.Labastractclasses.domain;

public class Manager extends Employee{


    public Manager(String name, double salary) {
        super(name, salary);
    }



    @Override
    public void calculateBonusSalary() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
