package home_work_4.home_work_3.runners;


import home_work_4.home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationDecorator;
import home_work_4.home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_4.home_work_3.calcs.api.ICalculator;
import home_work_4.home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.text.DecimalFormat;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorDecoratorMain {

    public static void main(String[] args) {


        ICalculator icalculator = new CalculatorWithCounterAutoAgregationDecorator(
                new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));


        icalculator.setAB(15,7);
        icalculator.getProizv();

        ((CalculatorWithMemoryDecorator)
                ((CalculatorWithCounterAutoAgregationDecorator)icalculator).getIcalculator()).Memory();



        icalculator.setAB(28,5);
        icalculator.getDel();


        icalculator.setFD(icalculator.getDel(),2);
        icalculator.getStep();

        icalculator.setAB(icalculator.getStep(),((CalculatorWithMemoryDecorator)
                ((CalculatorWithCounterAutoAgregationDecorator)icalculator).getIcalculator()).getMemory());
        icalculator.getSumm();
        ((CalculatorWithMemoryDecorator)
                ((CalculatorWithCounterAutoAgregationDecorator)icalculator).getIcalculator()).Memory();

        icalculator.setAB(4.1, ((CalculatorWithMemoryDecorator)
                ((CalculatorWithCounterAutoAgregationDecorator)icalculator).getIcalculator()).getMemory());

        DecimalFormat dr = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + dr.format(icalculator.getSumm()));

      if (icalculator instanceof CalculatorWithCounterAutoAgregationDecorator){
         System.out.println("количество вызовов математических операций =" +
                 " " + (((CalculatorWithCounterAutoAgregationDecorator)icalculator).getCountOperation()));}

        System.out.println("Последнее сохраненное в память число  " + dr.format(((CalculatorWithMemoryDecorator)
                ((CalculatorWithCounterAutoAgregationDecorator)icalculator).getIcalculator()).getMemory()));
    }




}
