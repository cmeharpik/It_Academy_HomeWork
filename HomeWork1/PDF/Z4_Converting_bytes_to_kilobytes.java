package HomeWork1.PDF;

import java.util.Scanner;


public class Z4_Converting_bytes_to_kilobytes {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1)Перевести байты в килобайты :? 2)Перевести килобайты в байты :? ");
        int number = scan.nextInt();

        if(number == 1){
            System.out.println("Какое колличество байтов будем переводить?");
            number = scan.nextInt();
            System.out.println(number * 0.0009765625);
        }

        if (number == 2){
            System.out.println("Какое колличество килобайтов будем переводить?");
            number = scan.nextInt();
            System.out.println(number * 1024);
        }
    }
}
