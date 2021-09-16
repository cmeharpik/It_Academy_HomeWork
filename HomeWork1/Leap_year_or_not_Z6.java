package HomeWork1;

import java.util.Scanner;


public class Leap_year_or_not_Z6 {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год ");
        int number= scan.nextInt();
        if(number % 4 == 0){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год не високосный");
        }
    }
}
