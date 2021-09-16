package HomeWork2.presentation;

import java.util.Scanner;

public class H10_2_Minimal_element {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int kol = scan.nextInt();
        int[] arr = new int[kol];
        int min = 0;//Минимальное
        int pr_min = 1;//Минимальное предыдущее

        System.out.println("Полученный массив ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200);
            System.out.print(arr[i] + " ");
        }

        for (int i = 2; i < arr.length; i++){
            if (arr[i] < arr[min]) {
                if (arr[min] < arr[pr_min]){
                    pr_min = min;
                }
                min = i;
            } else if (arr[i] < arr[min]) {
                pr_min = i;
            }
        }
        System.out.println("Минимальные элементы массива = " + arr[min] + " " + arr[pr_min]);

    }
}
