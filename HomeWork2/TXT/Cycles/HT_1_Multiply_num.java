package HomeWork2.TXT.Cycles;

import java.util.Scanner;

public class HT_1_Multiply_num {
    public static void main (String[] srt){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число до которого будем умножать");
        int number = scan.nextInt();
        int sum = 1;

        for (int i = 1; i <= number ; i++) {
            int a = sum * i;
            sum = a;
            if(i == number){
                System.out.print(i + " ");
            }else{
            System.out.print(i + " * ");}
        }
        System.out.println("Ответ = " + sum);
    }
}
