package javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers(){
        System.out.println(10+10);

    }

    public void substractTwoNumbers(){
        System.out.println(21-2);
    }

    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2){
        if (num2 == 0){
            System.out.println("Division per 0 is not possible!");
            return 0;
        }else{
            return num1/num2;
        }
    }

    public void changeTwoNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Inside changeTwoNumbers");
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
    }

    public void printTwoNumbersDivided(double num1, double num2){
        if (num2 == 0){
            System.out.println("Can't divide by 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void sumArray(int[] numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);

    }

    public void sumVarArgs(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Empty array!");
            return;
        } else {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println(sum);
        }
    }

}
