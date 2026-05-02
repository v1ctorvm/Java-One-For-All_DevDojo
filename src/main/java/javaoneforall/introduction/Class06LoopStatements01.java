package javaoneforall.introduction;

public class Class06LoopStatements01 {
    static void main() {

        // While, do while, for

        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }


        do {
            counter--;
            System.out.println("counter = " + counter);
        }while (counter != 0);

        for (int i = 0; i <= counter; i++){
            System.out.println("oi");
        }
    }
}
