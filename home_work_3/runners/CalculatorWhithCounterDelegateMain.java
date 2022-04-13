package home_work_3.runners;



import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithCounterDelegateMain {

    public static void main(String[] args) {


        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();

        calcComposite.setAB(15,7);
        double proizv = calcComposite.getProizv();

//        System.out.println(calcComposite.getProizv());

        calcComposite.setAB(28,5);
        calcComposite.getDel();

//        System.out.println(calcComposite.getDel());

        calcComposite.setFD(calcComposite.getDel(),2);
        calcComposite.getStep();
//        System.out.println(calcComposite.getStep());

        calcComposite.setAB(calcComposite.getStep(),proizv);
        double sum1 = calcComposite.getSumm();

        calcComposite.setAB(4.1, sum1);

 //       System.out.println( calcComposite.getSumm());

        DecimalFormat df = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + df.format(calcComposite.getSumm()));

        System.out.println("количество вызовов математических операций = " +  calcComposite.getCountOperation());


        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregation calcWO = new CalculatorWithCounterAutoAgregation(calc);
        calcWO.setAB(15,7);
        double proizved = calcWO.getProizv();

//        System.out.println(calcComposite.getProizv());

        calcWO.setAB(28,5);
        calcWO.getDel();

//        System.out.println(calcComposite.getDel());

        calcWO.setFD(calcWO.getDel(),2);
        calcWO.getStep();
//        System.out.println(calcComposite.getStep());

        calcWO.setAB(calcWO.getStep(),proizved);
        double sum3 = calcWO.getSumm();

        calcWO.setAB(4.1, sum3);

        //       System.out.println( calcComposite.getSumm());

        DecimalFormat dr = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + dr.format(calcWO.getSumm()));

        System.out.println("количество вызовов математических операций = " +  calcWO.getCountOperation());
















    }




}
