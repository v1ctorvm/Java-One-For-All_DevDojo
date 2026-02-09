package javaoneforall.javacore.Uregex.test;

public class ScannerTest01 {
    static void main() {

        // levi eren mikasa = Tokens
        String text = "Levi, Eren, Mikasa,true,200";
        String[] names = text.split(",");
        for (String name : names){
            System.out.println(name.trim());
        }




    }
}
