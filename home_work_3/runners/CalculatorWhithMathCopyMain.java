package home_work_4.home_work_3.runners;



import home_work_4.home_work_3.calcs.simple.CalculatorWithMathCopy;

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


        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        calc.setAB(x,y);
        double proizv = calc.getProizv();


        System.out.println ("Введите число для определения частного:  ");
        double a = in.nextDouble();
        System.out.println ("Введите еще одно число для определения частного:  ");
        double b = in.nextDouble();

        calc.setAB(a,b);
        calc.getDel();

        calc.setFD(calc.getDel(),2);
        calc.getStep();

        calc.setAB(calc.getStep(),proizv);
        double sum1 = calc.getSumm();

        calc.setAB(4.1, sum1);

        DecimalFormat df = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + df.format(calc.getSumm()));












    }




}
