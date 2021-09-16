package HomeWork1;

import java.util.Scanner;


public class Find_the_mean_Z2 {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1");
        int number = scan.nextInt();
        System.out.println("Введите число 2");
        int number2 = scan.nextInt();
        System.out.println("Введите число 3");
        int number3 = scan.nextInt();
        if (number<number2 && number2<number3){
            System.out.println(number2);
        }else if (number2<number && number<number3){
            System.out.println(number);
        }else if (number2<number3 && number3>number){
            System.out.println(number3);
        }

    }
}
