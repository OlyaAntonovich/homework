package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    double a;
    double b;

    public void setAB(double a,double b ) {
        this.a = a;
        this.b = b;
    }

    /**
     * деление двух чисел
     * @return результат деления двух чисел
     */

    public double getDel (){

        double del;
        del=a/b;
        return del;
    }


    /**
     * сумма двух чисел
     * @return результат суммирования двух числел/выражений
     */

    public double getSumm (){

        double summ;

        summ = a+b;

        return summ;
    }

    /**
     * вычитание
     * @return результат вычитания b из a
     */

    public double getSubtract (){

        double subtract;

        subtract = a-b;

        return subtract;
    }



    /**
     * метод считает произведение двух чисел
     * @return результат произведения двух чисел
     */

    public double getProizv (){

        double proizv;
        proizv=a*b;
        return proizv;
    }

    double f;
    double d;

    public void setFD(double f,double d ) {
        this.f = f;
        this.d = d;
    }

    /**
     * возведение в степень числа
     * @return результат возведения числа a в степень b
     */


    public double getStep (){

        double step=1;

        if (f>0) {

            for (int i = 1; i <= d; i++) {

                step = f * step;
            }
        }

        return step;
    }


    double c;

    public void setC(double c) {
        this.c = c;
    }

    /**
     * модуль числа
     * @return - возвращает модуль числа
     */

    public double getAbs (){

        double b;

        if (c<0){
            b = c*(-1);
        } else {b = c;}
        return b;
    }


      /**
     * вычисление квадратного корня из числа
     * @return - результат извлечения квадратного корня из числа
     */

    public double getSqrt (){


        double x;
        double y = (double) a/2;

        do {
            x = y;
            y = (x+(c/x))/2;

        } while ((x-y)!=0);


        return y;

    }



}
