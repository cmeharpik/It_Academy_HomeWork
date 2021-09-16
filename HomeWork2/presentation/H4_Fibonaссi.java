package HomeWork2.presentation;

import java.util.Scanner;

public class H4_Fibonaссi {
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int kol = scan.nextInt();
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i < kol; i++) {
            int fib = (a + b);
            System.out.println(fib);
            a = b;
            b = fib;
            }
        }
    }
