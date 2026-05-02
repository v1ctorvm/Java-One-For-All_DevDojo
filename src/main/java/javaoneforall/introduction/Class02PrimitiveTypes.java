package javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args){


        // int, double, float, boolean, char, byte, short, long
        int age = 121575219;
        long bugNumber = 10000;
        float salaryFloat = 2500;
        double salaryDouble = 5000;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 28;
        byte ageByte = 39;
        char character = 87; // Posso colocar numero da tabela ASCII / Unicode


        // cast - Precisa ter certeza que as coisas irà funcionar.
        int age2 = (int)100000000000L;
        System.out.println("age = " + age2);

        System.out.println("The age is " +age+ " years ols");

        System.out.println("character = " + character);



        String name = "Goku";

        String hiName = "Hi, im " + name; // COMO ESSA PORRA FUNCIONA??
        System.out.println("Name: " + name);

        System.out.println(hiName);






    }
}
