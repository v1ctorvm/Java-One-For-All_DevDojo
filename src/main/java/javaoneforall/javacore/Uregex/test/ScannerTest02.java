package javaoneforall.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    static void main() {

        // levi eren mikasa = Tokens
        String text = "Levi, Eren, Mikasa,true,200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
