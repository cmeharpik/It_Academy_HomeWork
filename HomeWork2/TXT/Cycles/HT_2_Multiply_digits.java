package HomeWork2.TXT.Cycles;

import java.util.Scanner;

public class HT_2_Multiply_digits {
    public static void main(String[] srt) {
        try {
        Scanner scan = new Scanner(srt [0]);
        int number = Integer.parseInt(srt[0]);
        int ost = 0;
        int proizved = 1;

        if(scan.hasNextLong()){
            System.out.println("Введена строка");
        }else if(scan.hasNextDouble()){
            System.out.println("Введено не целое число");
        }

        while (number  > 0) {
            if (number >= ost) {
                ost = number % 10;
                number /= 10;
                proizved = proizved * ost;
            }

            if (number > 0) {
                System.out.print(ost + " * ");
                ost = 0;
            } else {
                System.out.print(ost + " = " + proizved);
            }
        }

        } catch (NumberFormatException e) {
            try {
                double number = Double.parseDouble(srt[0]);
                System.out.println("Введено не целое число");
            } catch (NumberFormatException e2) {
                System.out.println("Введено не число");
            }
        }
    }
}