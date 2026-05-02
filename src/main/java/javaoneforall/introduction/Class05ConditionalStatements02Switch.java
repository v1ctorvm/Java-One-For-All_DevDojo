package javaoneforall.introduction;

public class Class05ConditionalStatements02Switch {
    static void main() {

        // Usuando swich, printa se e Business day or wekkend

        byte day = 7;

        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
