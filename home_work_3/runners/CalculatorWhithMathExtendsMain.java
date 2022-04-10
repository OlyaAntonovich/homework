package home_work_3.runners;



import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithMathExtendsMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println ("Введите число для вычисления произведения двух чисел:  ");
        double x = in.nextDouble();
        System.out.println ("Введите еще одно число для вычисления произведения двух чисел:  ");
        double y = in.nextDouble();


        CalculatorWithMathExtends proizv = new CalculatorWithMathExtends();
        proizv.setAB(x,y);

 //      System.out.println("Произведение двух чисел:" + proizv.getProizv());

        System.out.println ("Введите число для определения частного:  ");
        double a = in.nextDouble();
        System.out.println ("Введите еще одно число для определения частного:  ");
        double b = in.nextDouble();

        CalculatorWithMathExtends del = new CalculatorWithMathExtends();
        del.setAB(a,b);
//       System.out.println("Частное двух чисел:" + del.getDel());


        CalculatorWithMathExtends step = new CalculatorWithMathExtends();

         step.setFD(del.getDel(),2);

 //       System.out.println(step.getStep());

        CalculatorWithMathExtends sum1 = new CalculatorWithMathExtends();
        sum1.setAB(step.getStep(),proizv.getProizv());
        double sum2 = sum1.getSumm();

        CalculatorWithMathExtends sum = new CalculatorWithMathExtends();
        sum.setAB(4.1, sum2);

        DecimalFormat df = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + df.format(sum.getSumm()));












    }




}
