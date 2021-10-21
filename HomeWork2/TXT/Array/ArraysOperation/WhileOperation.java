package HomeWork2.TXT.Array.ArraysOperation;

public class WhileOperation  implements IArraysOperation{
    @Override
    public void print_all_it(int[] arr) {
        System.out.println("\nМассив");
        int i = 0;

        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++ ;
        }
    }

    @Override
    public void out_every_second_elem(int[] arr) {
        System.out.println("\nКаждый второй элемент массива ");
        int i = 1;

        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2 ;
        }
    }

    @Override
    public void allElem_array_reverseOrder(int[] arr) {
        System.out.println("\nВсе элементы массива в обратном порядке");
        int i = arr.length;

        while (i > 0) {
            System.out.print(arr[i - 1] + " ");
            i-- ;
        }
    }
}
