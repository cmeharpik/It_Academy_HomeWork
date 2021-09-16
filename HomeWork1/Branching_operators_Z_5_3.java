package HomeWork1;

import java.util.Scanner;

public class Branching_operators_Z_5_3 {
    public  static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scan.nextLine();
        switch (name){
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал" );
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал" );
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}
