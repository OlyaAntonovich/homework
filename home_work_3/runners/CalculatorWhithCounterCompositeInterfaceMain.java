package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.text.DecimalFormat;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithCounterCompositeInterfaceMain {

    public static void main(String[] args) {


        ICalculator icalculator = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface (icalculator);

        calculator.setAB(15,7);
        double proizved = calculator.getProizv();


        calculator.setAB(28,5);
        calculator.getDel();

        calculator.setFD(calculator.getDel(),2);
        calculator.getStep();

        calculator.setAB(calculator.getStep(),proizved);
        double sum3 = calculator.getSumm();

        calculator.setAB(4.1, sum3);

        DecimalFormat dr = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + dr.format(calculator.getSumm()));

        System.out.println("количество вызовов математических операций = " +  calculator.getCountOperation());
















    }




}
