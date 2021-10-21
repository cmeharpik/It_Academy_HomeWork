package HomeWork1.PDF;

import java.util.Scanner;


public class Z6_Leap_year_or_not {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите год ");
        int number= scan.nextInt();

        if(number % 4 == 0){
            System.out.println("Год високосный");

        }else if(number % 100 == 0 && number % 400 != 0){
            System.out.println("Год високосный");

        }else{
            System.out.println("Год не високосный");
        }
    }
}
