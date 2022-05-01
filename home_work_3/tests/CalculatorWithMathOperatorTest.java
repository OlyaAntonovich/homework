package home_work_3.tests;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathOperatorTest {

    @Test
    public void CalculatorWithOperatorTest (){

        CalculatorWithOperator calc = new CalculatorWithOperator();

//        Посчитать выражение 4.1+ 15*7+(28/5)^2 и получить 140.46

        calc.setAB(15,7);
        double proizv = calc.getProizv();
        calc.setAB(28,5);
        calc.getDel();
        calc.setFD(calc.getDel(),2);
        double step = calc.getStep();
        calc.setAB(4.1,proizv);
        calc.setAB(calc.getSumm(), step);
        System.out.println(calc.getSumm());

    }
}
