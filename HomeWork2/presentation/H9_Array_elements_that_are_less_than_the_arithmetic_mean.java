package HomeWork2.presentation;

public class H9_Array_elements_that_are_less_than_the_arithmetic_mean {
    public static void main(String[] str){
        int[] arr = {1,12,46,-5,21,4,17,-10,11,10};
        int sum = 0;
        double sred_arifm = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " " );
        }
        sred_arifm = sum / 10.0;
        System.out.println(" Среднеарифметическое " + sred_arifm);
        System.out.print("---> Элементы массива которые меньше средне арифметичекого значения ");

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] <= sred_arifm){
                System.out.print(" " + arr[i]);
            }
        }
    }
}
