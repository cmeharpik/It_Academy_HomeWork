package HomeWork1.PDF;

import java.util.Scanner;


public class Z3_Division_without_remainder {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число 1");
        int number = scan.nextInt();

        System.out.println("Введите число 2");
        int number2 = scan.nextInt();
        double number3;

        number3 = (double) number / number2;

        if (number % number2 == 0){
            System.out.println("Число делится без остатка " + number3);

        }else{
            System.out.println("Число делится с остатком "+ number3);
        }


    }
}
