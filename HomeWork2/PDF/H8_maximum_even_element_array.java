package HomeWork2.PDF;

public class H8_maximum_even_element_array {
    public static void main(String[] str){
        int arr[] = {1,12,46,-5,21,4,17,-10,11,10};
        int max = 0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length ; i++) {
            if( arr[i] % 2 == 0 && arr[i] > arr[max]) {
                arr[max] = arr[i];
            }
        }
        System.out.println(" Максимальный элемент массива " + arr[max]);
    }
}
