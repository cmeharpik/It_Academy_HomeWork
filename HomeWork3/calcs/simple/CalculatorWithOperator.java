package HomeWork3.calcs.simple;

import HomeWork3.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        double pow = 1;

        for (int i = 0; i < number2; i++) {
            pow = number * pow;
        }
        return pow;
    }

    public double mod(double number) {

        if (number > 0) {
            return number;
        }else{
            return number * (-1);
        }
    }
    public double squar(double number) {
        return Math.sqrt(number);
    }
}

