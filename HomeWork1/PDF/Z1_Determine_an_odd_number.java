package HomeWork1.PDF;

import java.util.Scanner;

public class Z1_Determine_an_odd_number {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число 1");
        int number = scan.nextInt();

        System.out.println("Введите число 2");
        int number2 = scan.nextInt();

        if (number % 2 == 0 && number2 % 2 == 0 ) {
            System.out.println(number + 1 );

        }else if(number % 2 != 0 && number2 % 2 != 0 ) {
            System.out.println(number );

        }else if (number % 2 != 0 && number2 % 2 == 0 ){
            System.out.println(number);

        }else if (number % 2 == 0 && number2 % 2 != 0 ){
            System.out.println(number2);
        }

    }
}
