package javaoneforall.javacore.Hinheritence.domain;

public class Manager extends Employee{

    private String department;

    @Override
    public void print() {
        super.print();
        System.out.println("Department: " + this.department);
        paymentReport();
    }

    public String getDepartment() {
        return department;
    }

    public void paymentReport(){
        System.out.println("The Employee: " + this.name + " from the department " + this.department +
                " received a salary of: " + this.salary);
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
