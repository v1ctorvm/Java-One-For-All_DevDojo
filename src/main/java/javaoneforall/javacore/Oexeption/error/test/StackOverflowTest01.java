package javaoneforall.javacore.Oexeption.error.test;

public class StackOverflowTest01 {
    static void main() {
        recursion();
    }

    public static void recursion(){
        recursion();
    }
}
