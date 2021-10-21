package HomeWork2.PDF;

import java.util.Random;
import java.util.Scanner;

public class H2_The_probability_of_even_random_numbers {
    public static void main(String[] str) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите число выборки (не менее 1000)");
        int kol = skan.nextInt();
        Random randomaz = new Random();
        int counter = 0;

        rand(kol,counter,randomaz);

    }

    public static void rand(int kol,double counter,Random randomaz) {

        for (int i = 0; i < kol; i++) {
            int number = randomaz.nextInt(kol);
            if (number % 2 == 0) {
                ++counter;
            }
        }
        System.out.println("Процент чётных чисел при выборке = " + kol + " псевдослучайных чисел равен " + 100.0 * counter / kol + "%");
    }
}
