package HomeWork2.TXT.Array.ArraysOperation.Test;

import HomeWork2.TXT.Array.ArraysOperation.DoWhileOperation;
import HomeWork2.TXT.Array.ArraysOperation.ForEachOperation;
import HomeWork2.TXT.Array.ArraysOperation.ForOperation;
import HomeWork2.TXT.Array.ArraysOperation.WhileOperation;

import java.util.Scanner;

import static HomeWork2.TXT.Array.HT_6_ArraysUtils.arrayRandom;

public class TestArraysOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = arrayRandom(10,100);

        System.out.println("Выберите действие");
        System.out.println("Нажмите (1) для вывода класса DoWhileOperation.");
        System.out.println("Нажмите (2) для вывода класса WhileOperation.");
        System.out.println("Нажмите (3) для вывода класса ForOperation.");
        System.out.println("Нажмите (4) для вывода класса ForEachOperation.");

        int ot = scan.nextInt();
        switch (ot) {
            case 1:
                DoWhileOperation do_while_OP = new DoWhileOperation();
                do_while_OP.print_all_it(array);
                do_while_OP.out_every_second_elem(array);
                do_while_OP.allElem_array_reverseOrder(array);
                break;

            case 2:
                WhileOperation while_OP = new WhileOperation();
                while_OP.print_all_it(array);
                while_OP.out_every_second_elem(array);
                while_OP.allElem_array_reverseOrder(array);
                break;

            case 3:
                ForOperation for_OP = new ForOperation();
                for_OP.print_all_it(array);
                for_OP.out_every_second_elem(array);
                for_OP.allElem_array_reverseOrder(array);
                break;

            case 4:
                ForEachOperation for_Each_OP = new ForEachOperation();
                for_Each_OP.print_all_it(array);
                for_Each_OP.out_every_second_elem(array);
                for_Each_OP.allElem_array_reverseOrder(array);
                break;
        }
    }
}
