package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] srt) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double multi = calc.multi(15, 7);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double sum = calc.sum(4.1, multi);
        double result = calc.sum(sum, pow);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);// 140,459
    }
}
