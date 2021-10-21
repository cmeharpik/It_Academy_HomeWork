package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

        private long count = 0;

        public void  incrementCountOperation(){
            this.count++;
        }

        public long getCountOperation(){
            return this.count;
        }
}
