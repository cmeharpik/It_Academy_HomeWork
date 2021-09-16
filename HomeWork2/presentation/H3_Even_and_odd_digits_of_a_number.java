package HomeWork2.presentation;

import java.util.Scanner;

public class H3_Even_and_odd_digits_of_a_number {
    public static void main (String[] str){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scan.nextInt();

        evenodd(number);

    }

    public static void evenodd(int number){
        int even = 0;
        int odd = 0;

        while (number > 0 ){
            if(number % 2 == 0 ){
                even += 1;
                number = number / 10;
            }else {
                odd += 1;
                number = number / 10;
            }

        }
        System.out.println("Чётных :" + even );
        System.out.println("Нечётных :" + odd);
    }
}
