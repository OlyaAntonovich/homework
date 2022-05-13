package home_work_3.runners;


import home_work_3.calcs.adapter.CalculatorAdapter;


/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */


public class CalculatorWhithAdapterMain {

    public static void main(String[] args) {


        CalculatorAdapter calculatorAdapter = new CalculatorAdapter ();

       double result = calculatorAdapter.calc("5+20*4+8/4");
        System.out.println(result);

    }




}
