package javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Eren Yeager";

    class Inner{
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    static void main() {

        OuterClassesTest01 outer = new OuterClassesTest01();
        Inner inner = outer.new Inner();

inner.printOuterClassAtribute();

    }
}
