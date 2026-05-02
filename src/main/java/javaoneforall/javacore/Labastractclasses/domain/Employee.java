package javaoneforall.javacore.Labastractclasses.domain;

public  abstract class Employee  extends Person{
    protected String name;
    protected double salary;

    public abstract void calculateBonusSalary();

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void print() {

    }
}
