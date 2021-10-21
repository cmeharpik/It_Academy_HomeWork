package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private long countOperation = 0;

    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc){
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calc){
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calc){
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calc;
    }

    public double sum(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.sum(a, b);
        } else if(this.calc2 != null){
            return this.calc2.sum(a, b);
        } else {
            return this.calc3.sum(a, b);
        }
    }

    public double sub(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.sub(a, b);
        } else if(this.calc2 != null){
            return this.calc2.sub(a, b);
        } else {
            return this.calc3.sub(a, b);
        }
    }

    public double multi(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.multi(a, b);
        } else if(this.calc2 != null){
            return this.calc2.multi(a, b);
        } else {
            return this.calc3.multi(a, b);
        }
    }

    public double div(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.div(a, b);
        } else if(this.calc2 != null){
            return this.calc2.div(a, b);
        } else {
            return this.calc3.div(a, b);
        }
    }

    public double pow(double a, int b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.pow(a, b);
        } else if(this.calc2 != null){
            return this.calc2.pow(a, b);
        } else {
            return this.calc3.pow(a, b);
        }
    }

    public double mod(double a){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.mod(a);
        } else if(this.calc2 != null){
            return this.calc2.mod(a);
        } else {
            return this.calc3.mod(a);
        }
    }

    public double squar(double a){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.squar(a);
        } else if(this.calc2 != null){
            return this.calc2.squar(a);
        } else {
            return this.calc3.squar(a);
        }
    }

    private void incrementCountOperation(){
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }
}
