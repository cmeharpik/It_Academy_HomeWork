package HomeWork1;

import java.util.Scanner;


public class letter_or_other_symbol_Z5 {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1");
        int number = scan.nextInt();
        if(number >=65 && number <=90 || number>=94 && number <=122){
            System.out.println("Это английская буква");
        }else{
            System.out.println("Это другой символ ");
        }





    }
}
