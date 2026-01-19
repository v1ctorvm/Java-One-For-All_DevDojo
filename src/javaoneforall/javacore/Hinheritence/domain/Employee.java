package javaoneforall.javacore.Hinheritence.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Adress adress;
    protected double salary;

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Social Security Number: " + this.socialSecurityNumber);
        System.out.println("Salary: " + this.salary);
        System.out.println("Adress: " + this.adress.getSreet() + " " +this.adress.getZipcode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSociaSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSociaSecurityNumber(String sociaSecurityNumber) {
        this.socialSecurityNumber = sociaSecurityNumber;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
