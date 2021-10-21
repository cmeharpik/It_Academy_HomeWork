package HomeWork2.TXT.Array.ArraysOperation;

//2.3.1. DoWhileOperation - во всех методах можно использовать только do....while

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void print_all_it(int[] arr){
        System.out.println("\nМассив");
        int i = 0;

        do{
            System.out.print(arr[i] + " ");
            i++;
        }while (i< arr.length);
    }

    @Override
    public void out_every_second_elem(int[] arr){
        System.out.println("\nКаждый второй элемент массива ");
        int i = 1;

        do{
            System.out.print(arr[i] + " ");
            i +=2;
        }while (i < arr.length);
    }
    @Override
    public  void allElem_array_reverseOrder(int[] arr){
        System.out.println("\nВсе элементы массива в обратном порядке ");
        int i = arr.length;

        do {
            System.out.print(arr[i - 1] + " ");
            i--;
        }while (i > 0);
    }
}
