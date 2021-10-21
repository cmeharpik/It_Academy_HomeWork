package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation = 0;

    private void incrementCountOperation(){
        countOperation++;
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return super.sum(a, b);
    }

    @Override
    public double sub(double a, double b) {
        incrementCountOperation();
        return super.sub(a, b);
    }

    @Override
    public double multi(double a, double b) {
        incrementCountOperation();
        return super.multi(a, b);
    }

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a, b);
    }

    @Override
    public double pow(double a, double b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    @Override
    public double mod(double a) {
        incrementCountOperation();
        return super.mod(a);
    }

    @Override
    public double squar(double a) {
        incrementCountOperation();
        return super.squar(a);
    }


    public long getCountOperation() {
        return countOperation;
    }
}

