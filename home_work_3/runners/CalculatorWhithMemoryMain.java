package home_work_4.home_work_3.runners;



import home_work_4.home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_4.home_work_3.calcs.api.ICalculator;
import home_work_4.home_work_3.calcs.simple.CalculatorWithOperator;

import java.text.DecimalFormat;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithMemoryMain {

    public static void main(String[] args) {


        ICalculator icalculator = new CalculatorWithOperator();
        CalculatorWithMemory calculator = new CalculatorWithMemory (icalculator);

        calculator.setAB(15,7);
        calculator.getProizv();
        calculator.Memory();

//        System.out.println(calculator.getMemory());

        calculator.setAB(28,5);
        calculator.getDel();

        calculator.setFD(calculator.getDel(),2);
        calculator.getStep();

        calculator.setAB(calculator.getStep(), calculator.getMemory());
        calculator.getSumm();

 //       System.out.println(calculator.getSumm());
        calculator.Memory();

        calculator.setAB(4.1, calculator.getMemory());

        DecimalFormat dr = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + dr.format(calculator.getSumm()));

        System.out.println("количество вызовов математических операций = " +  calculator.getCountOperation());
















    }




}
