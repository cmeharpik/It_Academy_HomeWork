package HomeWork2.TXT.Cycles;

import java.util.Scanner;

public class HT_3_Exponentiation {
    public static void main (String[] srt){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double number = scan.nextDouble();
        System.out.println("Введите степень");
        int number2 = scan.nextInt();
        double fin = 1;

        for (int i = 0; i <number2 ; i++) {
            fin =number * fin;
        }
        System.out.println(fin);
    }
}
