package javaoneforall.javacore.Oexeption.runtime.test;

public class RuntimeExeptionTest02 {
    static void main() {
        System.out.println(division(1,0));


    }

    private static int division(int a,int b){
        if (b == 0){
            throw new IllegalArgumentException("Division by 0 not permited");
        }

//        try {
//            return a/b;
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
        return a;
    }
}
