package javaoneforall.javacore.Qstring.test;

public class StringPerformanceTest01 {
    static void main() {

        long begin = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end- begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(30_000);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end- begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(30_000);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end- begin) + "ms");


    }

    private static void concatString(int size){
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size){
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int size){
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
