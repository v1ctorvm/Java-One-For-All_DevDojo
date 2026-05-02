package javaoneforall.javacore.Hinheritence.domain;

public class Manager extends Employee{

    private String department;

    static {
        System.out.println("Insitde Manager Static Init Block");
    }

    {
        System.out.println("Insitde Manager Static Init Block 1 ");
    }

    {
        System.out.println("Insitde Manager Static Init Block 2 ");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Department: " + this.department);
        paymentReport();
    }

    public Manager(String name) {
        System.out.println("Inside manager constructor");
        super(name);
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
