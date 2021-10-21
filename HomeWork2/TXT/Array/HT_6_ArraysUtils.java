package HomeWork2.TXT.Array;

import java.util.Scanner;
import java.util.Random;

//2.1. Создать класс ArraysUtils:
//        2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main. Данный метод размер массива и каждый его элемент запрашивает у пользователя
//        через консоль.
//        2.1.1.1. Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
//        2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main. Данный метод принимает два аргумента.
//        Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
//        2.1.2.1. Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99
//        (использовать класс Random) и сохранён в переменную container.

public class HT_6_ArraysUtils {

    public static int[] arrayFromConsole() {
        Scanner scan= new Scanner(System.in);

        System.out.println("\nВведите размер массива");
        int siz = scan.nextInt();
        int arr [] = new int[siz];

        for (int i = 0; i < siz ; i++) {
            System.out.println("Введите новый элемент массива");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(maxValueExclusion);
        }

        return arr;
    }
}
