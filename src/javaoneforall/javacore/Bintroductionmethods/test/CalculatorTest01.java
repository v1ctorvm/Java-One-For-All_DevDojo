package javaoneforall.javacore.Bintroductionmethods.test;

import javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    static void main() {

        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.substractTwoNumbers();

        calculator.multiplyTwoNumbers(10,2);

        double result = calculator.divideTwoNumbers(20,0);
        System.out.println(result);

        // System.out.println(calculator.printTwoNumbersDivided(20,2));
        calculator.printTwoNumbersDivided(20,0);

        calculator.changeTwoNumbers(10,1);

        int num1 = 1;
        int num2 = 2;
        calculator.changeTwoNumbers(num1,num2);
        System.out.println("Inside CalculatorTest01");
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
    }
}
