package javaoneforall.introduction;


public class Class04Operators {
    static void main(String[] args) {

        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 - number02;


        System.out.println(result);

        System.out.println(number01 + number02 + " Value: " + number01 + number02);

        // Relational - Returns True or False
        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwentr = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsTwenty = 10 == 20;

        System.out.println("isTenLowerThanTwenty = " + isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty = " + isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty = " + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwentr = " + isTenGreaterOrEqualsThanTwentr);
        System.out.println("isTenDifferentThanTwenty = " + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsTwenty = " + isTenEqualsTwenty);

        // && (AND) \ || (OR)

        int age = 35;
        float salary = 2500.0f;
        boolean isLeagalOrderThanThirty = age >= 30 && salary >= 4612;
        boolean isLeagalYungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLeagalYungerThanThirty = " + isLeagalYungerThanThirty);
        System.out.println("isLeagalOrderThanThirty = " + isLeagalOrderThanThirty);



        double currentAccount = 299;
        double savingsAccount = 3000;
        float playstationFivePrive = 500;
        boolean canBeBought = currentAccount > playstationFivePrive || savingsAccount > playstationFivePrive;
        System.out.println("canBeBought = " + canBeBought);


        // Assignment Operators - Operadores de Atribuição
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        // Unary = ++ -- (1 by one)
        int count = 0;
        System.out.println("count = " + count);
        count++;
        System.out.println("count = " + count);
        count--;
        System.out.println("count = " + count);

        System.out.println(++count); // Adiciona antes, e printa
        System.out.println(count++); // Printa e depois adiciona




    }
}
