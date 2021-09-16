package HomeWork1.ICommunicationPrinter_interface_Z_8;

import java.util.Objects;
import java.util.Scanner;

public class Branching_operators_Z_5_1 implements  ICommunicationPrinter{
    @Override
    public void welcom(String namer) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scan.nextLine();
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("А вы кто?");
        }

    }
}
