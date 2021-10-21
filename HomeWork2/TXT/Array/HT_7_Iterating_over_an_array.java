package HomeWork2.TXT.Array;

import java.util.Scanner;

//2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный arrayFromConsole. Все задачи в одном классе,
//        в отдельных методах. Должно получиться 3 метода:

public class HT_7_Iterating_over_an_array {

    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);

        int[] arr = HT_6_ArraysUtils.arrayFromConsole();

        System.out.println("Выберите действие");
        System.out.println("Нажмите (1) для вывода всех элементов массива в консоль.");
        System.out.println("Нажмите (2) для вывода каждого второго элемента массива в консоль.");
        System.out.println("Нажмите (3) для вывода всех элементов массива в консоль в обратном порядке.");

        int ot = scan.nextInt();

        switch (ot) {
            case 1:
                mas_for(arr);
                break;
            case 2:
                mas_for(arr);
                while_(arr);
                break;
            case 3:
                mas_for(arr);
                mas_obrat(arr);
                break;
        }
    }

    //ForEach
    public static void mas_for(int[] arr) {
        System.out.println("Массив ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //do...while
    public static void while_(int[] arr) {
        System.out.println("\nКаждый второй эллемент ");
        int i = 1;

        do {
            System.out.print(arr[i] + "  ");
            i += 2;
        } while (i < arr.length);
    }

    //while
    public static void mas_obrat(int[] arr) {
        System.out.println("\nМассив в обратном порядке ");
        int a = arr.length;

        while (a > 0) {
            System.out.print(arr[a - 1] + " ");
            a--;
        }
    }
}
