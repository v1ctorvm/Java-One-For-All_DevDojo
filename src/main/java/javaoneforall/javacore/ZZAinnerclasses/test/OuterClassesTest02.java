package javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {

    private String name = "Eren";

    void print() {
        String lastName = "Yaeger";
        class LocalCLass {
            public void printName() {
                System.out.println(name + " " + lastName);
            }
        }
//        LocalCLass localCLass = new LocalCLass();
//        localCLass.printName();
        new LocalCLass().printName();

    }

    static void main() {


        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();

    }
}
