package home_work_3.runners;



import home_work_3.calcs.additional.CalculatorWhithCounterClassic;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithCounterClassicMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println ("Введите число для вычисления произведения двух чисел:  ");
        double x = in.nextDouble();
        System.out.println ("Введите еще одно число для вычисления произведения двух чисел:  ");
        double y = in.nextDouble();

        CalculatorWhithCounterClassic count =  new CalculatorWhithCounterClassic();
        CalculatorWhithCounterClassic proizv = new CalculatorWhithCounterClassic();
        proizv.setAB(x,y);

 //       System.out.println("Произведение двух чисел:" + proizv.getProizv());


            count.incrementCountOperation();
 //       System.out.println(count.getCountOperation());



        System.out.println ("Введите число для определения частного:  ");
        double a = in.nextDouble();
        System.out.println ("Введите еще одно число для определения частного:  ");
        double b = in.nextDouble();

        CalculatorWhithCounterClassic del = new CalculatorWhithCounterClassic();
        del.setAB(a,b);
 //       System.out.println("Частное двух чисел:" + del.getDel());

        count.incrementCountOperation();


        CalculatorWhithCounterClassic step = new CalculatorWhithCounterClassic();

         step.setFD(del.getDel(),2);

 //       System.out.println(step.getStep());
        count.incrementCountOperation();

        CalculatorWhithCounterClassic sum1 = new CalculatorWhithCounterClassic();
        sum1.setAB(step.getStep(),proizv.getProizv());
        double sum2 = sum1.getSumm();
        count.incrementCountOperation();

        CalculatorWhithCounterClassic sum = new CalculatorWhithCounterClassic();
        sum.setAB(4.1, sum2);
        count.incrementCountOperation();


        DecimalFormat df = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + df.format(sum.getSumm()));
        System.out.println("количество вызовов математических операций = " +  count.getCountOperation());













    }




}
