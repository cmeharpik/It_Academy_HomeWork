package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double multi = calc.multi(15, 7);
        calc.incrementCountOperation();
        double div = calc.div(28, 5);
        calc.incrementCountOperation();
        double pow = calc.pow(div, 2);
        calc.incrementCountOperation();
        double sum = calc.sum(4.1, multi);
        calc.incrementCountOperation();
        double result = calc.sum(sum, pow);
        calc.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);// 140,459
        System.out.println("Калькулятор использовали :" + calc.getCountOperation() + " раз." );
    }
}
