package HomeWork2.presentation;

import java.util.Scanner;

public class H12_Sum_of_array_digits {
    public static void main(String[] srt){
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите количество чисел");
            int kol = scan.nextInt();
            int[] arr = new int[kol];
            int sum = 0;
            int ost = 0;

            System.out.println("Полученный массив ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 200);
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i < arr.length; i++) {
                while (arr[i] != 0) {
                    ost = arr[i] % 10;
                    sum += ost;
                    arr[i] /= 10;
                }
            }
            System.out.println("Сумма чисел = " + sum);
    }
}
