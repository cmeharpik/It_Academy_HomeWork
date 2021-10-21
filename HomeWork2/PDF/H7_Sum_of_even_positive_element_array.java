package HomeWork2.PDF;

public class H7_Sum_of_even_positive_element_array {
    public static void main(String[] srt){
        int[] arr = {1,12,47,-5,21,4,17,-10,11,10};
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= 0 && arr [i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.print("Сумма чётных положительных элементав массива = "+ sum);
    }
}
