package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc;
        //calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
        //calc = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
        calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());

        double multi = calc.multi(15, 7);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double sum = calc.sum(4.1, multi);
        double result = calc.sum(sum, pow);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);// 140,459
        System.out.println("Количество использований калькулятора: " + calc.getCountOperation());
    }
}
