package HomeWork2.presentation;

import java.util.Scanner;

public class H5_Number_for_steps {
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимум");
        int min = scan.nextInt();
        System.out.println("Введите максимум");
        int max = scan.nextInt();
        System.out.println("Введите шаг");
        int step = scan.nextInt();
        System.out.print("С шагом "+ step + " получится " + min + " ");
        int number = min;

        for (int i = min; i < max ; i++) {
            int sum = number + step;
            number = sum;
            System.out.print(sum + " ");
        }

    }
}
