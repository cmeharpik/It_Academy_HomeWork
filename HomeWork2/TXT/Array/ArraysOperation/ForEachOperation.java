package HomeWork2.TXT.Array.ArraysOperation;

//2.3.4. ForEachOperation - во всех методах можно использовать только foreach

public class ForEachOperation implements IArraysOperation {

    @Override
    public void print_all_it(int[] arr) {
        System.out.println("\nМассив");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    @Override
    public void out_every_second_elem(int[] arr) {
        System.out.println("\nКаждый второй элемент массива ");
        int a = 1;

        for (int i : arr) {
            if (a % 2 == 0) {
                System.out.print(i + " ");
            }
            a++;
        }
    }

    @Override
    public void allElem_array_reverseOrder(int[] arr) {
        System.out.println("\nМассив в обратном порядке ");
        int i = arr.length ;

        for (int a : arr) {
            System.out.print(arr[i - 1] + " ");
            i--;
        }
    }
}
