package HomeWork2.TXT.Cycles;

import java.util.Scanner;

public class HT_4_Overflow {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        long a = 1;
        boolean er = true;

        while (er){
            try{
                a = Math.multiplyExact(a,number);
                System.out.print(a + " * ");

            }catch (Exception b){
                System.out.println("Переполнение");
                System.out.println("\nЧисло до переполнения " + a);
                System.out.println("\nЧисло после переполнения " + (a * number));
                er = false;
            }
        }
    }
}
