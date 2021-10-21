package HomeWork2.TXT.Sort;

import HomeWork2.TXT.Array.HT_6_ArraysUtils;

import java.util.Scanner;

//Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
//        4.3.1. {1,2,3,4,5,6}
//        4.3.2. {1,1,1,1}
//        4.3.3. {9,1,5,99,9,9}
//        4.3.4. {}
//        4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
//        4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.

public class SortsUtils {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие");
        System.out.println("Нажмите (1) для выполнения сортировки массивов которые заданы прямо в коде.");
        System.out.println("Нажмите (2) для выполнения сортировки массива созданного с помощью arrayRandom.");
        System.out.println("Нажмите (3) для выполнения сортировки массива созданного с помощью arrayFromConsole.");

        int ot = scan.nextInt();

        switch (ot) {
            case 1:
            int[] arr = {1, 2, 3, 4, 5, 6};
            bubble(arr);

            int[] arr2 = {1, 1, 1, 1};
            bubble(arr2);

            int[] arr3 = {9, 1, 5, 99, 9, 9};
            bubble(arr3);

            int[] arr4 = {};
            bubble(arr4);
            break;

            case 2:
            int[] arr5 = HT_6_ArraysUtils.arrayRandom(10, 100);
            bubble(arr5);
            break;

            case 3:
            int[] arr6 = HT_6_ArraysUtils.arrayFromConsole();
            bubble(arr6);
            break;
        }
    }

    public static void bubble(int arr[]) {
        System.out.println("\nМассив до сортировки");
        for (int a : arr)
            System.out.print(a + "  ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                }
            }
        }
        System.out.println("\nМассив после сортировки");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
