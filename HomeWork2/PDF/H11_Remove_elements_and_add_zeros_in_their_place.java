package HomeWork2.PDF;

import java.util.Scanner;


public class H11_Remove_elements_and_add_zeros_in_their_place {
    public static void main  (String[] srt){
        Scanner scan = new Scanner(System.in);
        int[] arr = {12,46,-5,21,4,17,-10,11,-7,10};
        int kol =arr.length;

        System.out.println("Введите начало и конец интервала");
        int interval = scan.nextInt();
        int interval2 = scan.nextInt();;
        System.out.print("Массив ");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print( arr[i] +" ");
        }

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] >= interval && arr[i]<= interval2 ){
                kol--;

                for (int a = i; a < kol; a++) {
                   arr[a] = arr[a + 1];

                }
            }else ++i;
        }

        for (int k = kol; k < arr.length; k++) {
            arr[k] = 0;
        }
        System.out.print("\nИзменённый массив ");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
