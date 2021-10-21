package HomeWork1.TXT;

import java.util.Scanner;

public class Z5_3_Branching_operators {
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
