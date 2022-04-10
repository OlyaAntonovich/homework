package home_work_3.runners;



import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithMathCopyMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println ("Введите число для вычисления произведения двух чисел:  ");
        double x = in.nextDouble();
        System.out.println ("Введите еще одно число для вычисления произведения двух чисел:  ");
        double y = in.nextDouble();


        CalculatorWithMathCopy proizv = new CalculatorWithMathCopy();
        proizv.setAB(x,y);

 //      System.out.println("Произведение двух чисел:" + proizv.getProizv());

        System.out.println ("Введите число для определения частного:  ");
        double a = in.nextDouble();
        System.out.println ("Введите еще одно число для определения частного:  ");
        double b = in.nextDouble();

        CalculatorWithMathCopy del = new CalculatorWithMathCopy();
        del.setAB(a,b);
//       System.out.println("Частное двух чисел:" + del.getDel());


        CalculatorWithMathCopy step = new CalculatorWithMathCopy();

         step.setFD(del.getDel(),2);

 //       System.out.println(step.getStep());

        CalculatorWithMathCopy sum1 = new CalculatorWithMathCopy();
        sum1.setAB(step.getStep(),proizv.getProizv());
        double sum2 = sum1.getSumm();

        CalculatorWithMathCopy sum = new CalculatorWithMathCopy();
        sum.setAB(4.1, sum2);

        DecimalFormat df = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + df.format(sum.getSumm()));












    }




}
