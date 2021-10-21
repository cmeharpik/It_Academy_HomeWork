package HomeWork2.TXT.Array;

import java.util.Scanner;

//2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
//        2.4.1. Сумма четных положительных элементов массива
//        2.4.2. Максимальный из элементов массива с четными индексами
//        2.4.3. Элементы массива, которые меньше среднего арифметического
//        2.4.4. Найти два наименьших (минимальных) элемента массива
//        2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//        2.4.6. Сумма цифр массива

public class HT_9_Taskcode extends HT_6_ArraysUtils {

    public static void main(String[] args) {
        sum();
        maxElem();
        average();
        two_smallest_elements();
        compressing_an_array();
    }

    public static void sum() {
        int[] arr = HT_6_ArraysUtils.arrayRandom(10,100);
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0){
                sum += arr[i];
            }
        }
        System.out.println("Сумма чётных положительных элементов массива = " + sum);
    }

    public static  void maxElem(){
        int[] arr = HT_6_ArraysUtils.arrayRandom(10,100);
        int max = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 == 0 && arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива " + max);
    }

    public static  void average(){
        int[] arr = HT_6_ArraysUtils.arrayRandom(10,100);
        int aver = 0;

        for (int i = 0; i < arr.length ; i++) {
            aver += arr[i];
        }
        System.out.println("Cредне арифметическое элементов массива = " + aver/ arr.length);
        System.out.println("Элементы массива которые меньше " + aver/ arr.length);

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < aver/ arr.length){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void two_smallest_elements() {
        int[] arr = HT_6_ArraysUtils.arrayRandom(10,100);
        int min = 0;//Минимальное
        int pr_min = 1;//Минимальное предыдущее

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
        System.out.println("\nМинимальные элементы массива = " + arr[min] + ", " + arr[pr_min]);
    }

    public static void compressing_an_array(){
        int[] arr = HT_6_ArraysUtils.arrayRandom(10,100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начало и конец интервала");
        int interval = scan.nextInt();
        int interval2 = scan.nextInt();
        int kol = arr.length;

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] >= interval && arr[i]<= interval2 ){
                kol--;

                for (int a = i; a < kol; a++) {
                    arr[a] = arr[a + 1];

                }
            } else ++i;
        }

        for (int k = kol; k < arr.length; k++) {
            arr[k] = 0;
        }
        System.out.print("\nИзменённый массив ");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void sum_arr_digits(){
        int[] arr = HT_6_ArraysUtils.arrayRandom(10,100);
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum +=arr[i];
        }
        System.out.println("Сумма элементов массива =" + sum);
    }
}
