package HomeWork3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] srt) {
        double pow = 28.0 / 5.0;
        for (int i = 1; i < 2 ; i++) {
            pow = pow * pow;
        }
        double answer = 4.1 + 15 * 7 + pow; // 140,459
        System.out.println("Результат = " + answer);
    }
}
