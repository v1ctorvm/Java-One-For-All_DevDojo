package javaoneforall.javacore.Labastractclasses.domain;

public class Developer extends Employee{

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary() {
        this.salary *= 0.1;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void print() {
        super.print();
    }
}
