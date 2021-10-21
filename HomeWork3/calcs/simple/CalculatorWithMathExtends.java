package HomeWork3.calcs.simple;

import HomeWork3.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double pow(double number, double number2) {
        return Math.pow(number, number2);
    }

    @Override
    public double mod(double number) {
        return Math.abs(number);
    }

    @Override
    public double squar(double number) {
        return Math.sqrt(number);
    }
}

