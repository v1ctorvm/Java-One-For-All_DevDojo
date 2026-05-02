package javaoneforall.javacore.ZZAinnerclasses.test;




public class OuterClassesTest03 {

    protected String name = "Victor Matheus";


    static class Inner {
        public void printOuterClassAtribute() {
            System.out.println(new OuterClassesTest03().name);
        }
    }

    static void main() {

        Inner inner = new Inner();
        inner.printOuterClassAtribute();


    }
}
