package javaoneforall.introduction;

public class Class07Arrays01 {
    static void main() {

        int[] ages = new int[5];
        ages[0] = 12;
        ages[1] = 13;
        ages[2] = 14;
        System.out.println(ages[2]);


        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{5,4,3,2,1};


        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }



    }
}
