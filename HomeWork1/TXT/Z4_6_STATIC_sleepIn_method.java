package HomeWork1.TXT;


import java.util.Scanner;

public class Z4_6_STATIC_sleepIn_method {
    public static boolean SleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Z4_6_STATIC_sleepIn_method sleep = new Z4_6_STATIC_sleepIn_method();
        boolean answer1,answer2;

        System.out.println("Будний день?");
        answer1 = scan.nextBoolean();

        System.out.println("Отпуск?");
        answer2 = scan.nextBoolean();

        boolean otv = sleep.SleepIn(answer1,answer2);

        if(otv){
            System.out.println("Можно спать");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
}