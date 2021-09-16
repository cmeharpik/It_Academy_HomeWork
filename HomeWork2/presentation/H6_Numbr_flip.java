package HomeWork2.presentation;

import java.util.Scanner;

public class H6_Numbr_flip {
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        int number2 = number;

        numb_dig(number2,number);
    }



    public static void numb_dig(int number2,int number) {
        int number_digit = 0;
        int final_digits = 0;

        while (number2 > 0) {
            int del = number2 / 10;
            number_digit++;
            number2 = del;
        }
        for (int i = 0; i < number_digit; i++) {
            final_digits = final_digits * 10 + number % 10;
            number = number / 10;
            if (final_digits == 0) {
                System.out.print("0");
            }
        }
        System.out.print(final_digits);
    }
}
