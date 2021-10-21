package HomeWork2.TXT.Array.ArraysOperation;

//2.3.3. ForOperation - во всех методах можно использовать только for

public class ForOperation implements IArraysOperation{
    @Override
    public void print_all_it(int[] arr) {
        System.out.println("\nМассив");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void out_every_second_elem(int[] arr) {
        System.out.println("\nКаждый второй элемент массива ");

        for (int i = 1; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
            i += 1;
        }
    }

    @Override
    public void allElem_array_reverseOrder(int[] arr) {
        System.out.println("\nВсе элементы массива в обратном порядке");

        for (int i = (arr.length - 1); i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
