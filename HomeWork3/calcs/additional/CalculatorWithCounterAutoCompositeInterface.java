package HomeWork3.calcs.additional;

import HomeWork3.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterface {
    private long countOperation = 0;

    private final ICalculator calc;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calc){
        this.calc = calc;
    }

    public double sum(double a, double b){
        incrementCountOperation();
        return this.calc.sum(a, b);

    }

    public double sub(double a, double b){
        incrementCountOperation();
        return this.calc.sub(a, b);

    }

    public double multi(double a, double b){
        incrementCountOperation();
        return this.calc.multi(a, b);

    }

    public double div(double a, double b){
        incrementCountOperation();
        return this.calc.div(a, b);
    }

    public double pow(double a, double b){
        incrementCountOperation();
        return this.calc.pow(a, b);

    }

    public double mod(double a){
        incrementCountOperation();
        return this.calc.mod(a);

    }

    public double squar(double a){
        incrementCountOperation();
        return this.calc.squar(a);

    }

    private void incrementCountOperation(){
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }
}
