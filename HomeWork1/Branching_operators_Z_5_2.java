package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Branching_operators_Z_5_2 {
    public  static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scan.nextLine();
        if(Objects.equals(name, "Вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал" );
        }else if (Objects.equals(name,"Анастасия")){
            System.out.println("Я тебя так долго ждал" );
        }else{
            System.out.println("А вы кто?");
        }

    }
}
