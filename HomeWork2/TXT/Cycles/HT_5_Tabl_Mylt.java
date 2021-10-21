package HomeWork2.TXT.Cycles;

public class HT_5_Tabl_Mylt {
    public static void main(String[] srt) {
        int number = 1;
        int kol = 10;
        int proz = 0;

        for (int i = 1; i <= kol; i++) {
            for (int j = 2; j <= 5; j++) {
                proz = j * number;
                if(proz < 10) {
                    System.out.print(" " + j + " * " + number + " = " + proz + "      ||");

                }else if(number == 10) {
                    System.out.print(" " + j + " * " + number + " = " + proz + "    ||");

                }else{
                    System.out.print(" " + j + " * " + number + " = " + proz + "     ||");
                }

                if (j == 5) {
                    System.out.println();
                }
            }
            ++number;
        }
        number = 1;

        System.out.println("======================================================================||");

        for (int i = 1; i <= kol; i++) {
            for (int j = 6; j < 10; j++) {
                proz = j * number;

                if(proz < 10) {
                    System.out.print(" " + j + " * " + number + " = " + proz + "      ||");

                }else if(number == 10) {
                    System.out.print(" " + j + " * " + number + " = " + proz + "    ||");

                }else{
                    System.out.print(" " + j + " * " + number + " = " + proz + "     ||");
                }

                if (j == 9) {
                    System.out.println();
                }
            }
            ++number;
        }
        System.out.println("========================================================================");
        System.out.println("" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░▒▒▒▒▒▒▒▓▒▒▓▒▒▒▒▒▒▒░█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░▒▒▓▒▒▒▒▒▒▒▒▒▄▄▒▓▒▒░█░▄▄\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▀▀▄▄█░▒▒▒▒▒▒▓▒▒▒▒█░░▀▄▄▄▄▄▀░░█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░█░▒▒▒▒▒▒▒▒▒▒▒█░░░░░░░░░░░█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▀▄▄█░▒▒▒▒▓▒▒▒▓▒█░░░█▒░░░░█▒░░█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░▒▓▒▒▒▒▓▒▒▒█░░░░░░░▀░░░░░█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▄█░▒▒▒▓▒▒▒▒▒▒▒█░░█▄▄█▄▄█░░█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░█▄▄▄▄▄▄▄▄▄▄█░█▄▄▄▄▄▄▄▄▄█\n" +
                "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▄▄█░░█▄▄█░░░░░░█▄▄█░░█▄▄█");
    }
}

