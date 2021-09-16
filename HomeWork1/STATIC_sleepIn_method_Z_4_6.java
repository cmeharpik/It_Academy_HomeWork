package HomeWork1;


import java.util.Scanner;

public class STATIC_sleepIn_method_Z_4_6 {
    public static void main(String[] srt) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите   weekday(true) или vacation(false)");
        Boolean day = scan.nextBoolean();
        System.out.println("Введите  weekday(true) или vacation(false)");
        Boolean day2 = scan.nextBoolean();
        STATIC_sleepIn_method_Z_4_6 rez1=new STATIC_sleepIn_method_Z_4_6();
        rez1.SleepIn(day,day2);
    }

    public static void SleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            System.out.println("Спите дальше");
        }else{
            System.out.println("Пора вставать ");
        }
    }
}