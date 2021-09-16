package HomeWork1;

import java.util.Scanner;

public class Bitwise_operations_Z1_5 {
    public static void  main (String[] str){
        //42,15 && -42,15
        Scanner scan = new Scanner(System.in);
        System.out.println("С какими числами будем работать 1)(42 и 15)  2)(-42 и -15)");
        int far = scan.nextInt();
        if(far == 1){
            int number = 42;//101010
            int number2 = 15;//1111

            int q = ~number;//q(-101011)= ~101010

            int w = number & number2;//w(1010)=101010 & 1111

            int r = number | number2;//r(101111)=101010 | 1111

            int y = number ^ number2;//y(100101)=101010 ^ 1111

            int i = number >> number2;//i(0)=101010 >> 1111

            int p = number >>> number2;//p(0)=101010 >>> 1111

            int a = number << number2;//a(0)=101010 << 1111

            System.out.println("При использовании побитового оператора ~ " + q);
            System.out.println("При использовании побитового оператора & " + w);
            System.out.println("При использовании побитового оператора | " + r);
            System.out.println("При использовании побитового оператора ^ " + y);
            System.out.println("При использовании побитового оператора >> " + i);
            System.out.println("При использовании побитового оператора >>> " + p);
            System.out.println("При использовании побитового оператора << " + a);

        }

        if (far == 2){
            int number = -42;//-101010
            int number2 = -15;//-1111
            double number3 = 42.5;

            int q = ~number;//q(101001)= ~ -101011

            int w = number & number2;//w(-110000)= -101010 & -1111

            int r = number | number2;//r(-1001)= -101010 | -1111

            int y = number ^ number2;//y(100111)= -101010 ^ -1111

            int i = number >> number2;//i(-1)= -101010 >> -1111

            int p = number >>> number2;//p(111 1111 1111 1111)= -101010 >>> -1111

            int a = number << number2;
            //a(1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1010 1100 0000 0000 0000 0000)= -101010 << -1111

            System.out.println("При использовании побитового оператора ~ " + q);
            System.out.println("При использовании побитового оператора & " + w);
            System.out.println("При использовании побитового оператора | " + r);
            System.out.println("При использовании побитового оператора ^ " + y);
            System.out.println("При использовании побитового оператора >> " + i);
            System.out.println("При использовании побитового оператора >>> " + p);
            System.out.println("При использовании побитового оператора << " + a);
        }


    }
}
