package HomeWork2.PDF;

import java.util.Scanner;

public class H1_Find_the_richest_digit_in_a_number {
    public static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scan.nextInt();
        int ost = number % 10;
        number/= 10;

        while (number !=0 ){
            if(number % 10 > ost ){
                ost = number % 10;
            }
            number/= 10;
        }
        System.out.println("Наибольшая цифра в числе = " + ost);
    }
}

