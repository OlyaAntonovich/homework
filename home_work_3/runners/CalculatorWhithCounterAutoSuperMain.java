package home_work_3.runners;



import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithCounterAutoSuperMain {

    public static void main(String[] args) {


        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        Scanner in = new Scanner(System.in);
        System.out.println ("Введите число для вычисления произведения двух чисел:  ");
        double x = in.nextDouble();
        System.out.println ("Введите еще одно число для вычисления произведения двух чисел:  ");
        double y = in.nextDouble();

        calc.setAB(x,y);
        double proizv = calc.getProizv();

//        System.out.println(calc.getProizv());


        System.out.println ("Введите число для определения частного:  ");
        double a = in.nextDouble();
        System.out.println ("Введите еще одно число для определения частного:  ");
        double b = in.nextDouble();

        calc.setAB(a,b);
        calc.getDel();

 //       System.out.println(calc.getDel());

        calc.setFD(calc.getDel(),2);
        calc.getStep();
//        System.out.println(calc.getStep());



        calc.setAB(calc.getStep(),proizv);
        double sum1 = calc.getSumm();



        calc.setAB(4.1, sum1);

//        System.out.println( calc.getSumm());

        DecimalFormat df = new DecimalFormat ("#.##");

        System.out.println("результат выражения:4.1+ 15*7+(28/5)^2 = " + df.format(calc.getSumm()));

        System.out.println("количество вызовов математических операций = " +  calc.getCountOperation());













    }




}
