package HomeWork3.calcs.simple;

import HomeWork3.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double sum(double number, double number2) {
        return number + number2;
    }

    public double sub(double number, double number2) {
        return number - number2;
    }

    public double multi(double number, double number2) {
        return number * number2;
    }

    public double div(double number, double number2) {
        return number / number2;
    }

    public double pow(double number, double number2) {
        return Math.pow(number, number2);
    }

    public double mod(double number) {
        return Math.abs(number);
    }
    public double squar(double number) {
        return Math.sqrt(number);
    }
}
