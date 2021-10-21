package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.additional.CalculatorWithCounterClassic;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoCompositeInterface calc;
//        calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
//        calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());
//       calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());
        calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithCounterClassic());


        double multi = calc.multi(15, 7);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double sum = calc.sum(4.1, multi);
        double result = calc.sum(sum, pow);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);// 140,459
        System.out.println("Количество использований калькулятора: " + calc.getCountOperation());
    }
}
