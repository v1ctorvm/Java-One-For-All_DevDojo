package javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    static void main() {


        int[][] array = new int[3][]; // Isso é um Array com 3 espacos [0][1][2]

        array[0] = new int[2]; // No espaço 0, tem outro array com 2 espaços - [0] | [0][1]
        array[1] = new int[3]; // No espaço 1, tem outro array com 3 espaços - [1] | [0][1][2]
        array[2] = new int[6]; // No espaço 2, tem outro array com 6 espaços - [2] | [0][1][2][3][4][5]




        for (int[] baseArray : array){
            for (int num : baseArray){
                System.out.println(num);
            }
        }

    }
}
