package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorAdapter {
    private final ICalculator calculator;

    public CalculatorAdapter() {
        this.calculator = new CalculatorWithMathExtends();
    }

    public double calc (String expression){
        double result = 0;
        result + = calculator.add ();
        return result;
    }
}
