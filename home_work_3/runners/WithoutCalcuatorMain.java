package home_work_3.runners;
/**
 * Посчитать выражение 4.1+ 15*7+(28/5)^2
 * и вывести сохраненный результат в консоль
 */

import java.text.DecimalFormat;

public class WithoutCalcuatorMain {
    public static void main(String[] args) {

        int a = 15;
        int b = 7;

        double proizv = proizv (a, b);



        double s = 28;
        double r = 5;

        double del = del (s, r);


        int x = 2;
        double step = step (del, x);


        double y = 4.1;

        double [] numbers = {y,proizv,step };
        double sum = sumAll (numbers);

        DecimalFormat df = new DecimalFormat("#.##"); //140.46

        System.out.println(df.format(sum));

    }

    /**
     * метод считает произведение двух чисел
     * @param a первое число
     * @param b второе число
     * @return результат произведения двух чисел
     */

    public static double proizv (int a, int b){

        double proizv;
        proizv=a*b;
        return proizv;
    }

    /**
     * деление двух чисел
     * @param a первое число
     * @param b второе число
     * @return результат деления двух чисел
     */

    public static double del (double a, double b){

        double del;
        del=a/b;
        return del;
    }

    /**
     * возведение в степень числа
     * @param a выражение, которое нужно возвести в степень
     * @param b степень
     * @return результат возведения числа a в степень b
     */


    public static double step (double a, int b){

        double step=1;

        for (int i=1; i<=b; i++){

            step=a*step;
        }

        return step;
    }

    /**
     * Считает сумму всех чисел/выражений
     * @param numbers массив, созданный из суммируемых частей
     * @return результат - сумма всех чисел/выражений
     */



    public static double sumAll (double [] numbers){

        double sum =0;

        for(int i=0; i<numbers.length;i++ ) {
            sum= sum+numbers[i];
        }

        return sum;
    }


}
