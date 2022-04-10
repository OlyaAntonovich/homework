package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {

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
    int d;

    public void setFD(double f,int d ) {
        this.f = f;
        this.d = d;
    }

    /**
     * возведение в степень числа
     * @return результат возведения числа a в степень b
     */


    public double getStep (){

        return Math.pow (f,d);
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

        return Math.abs(c);
    }


    /**
     * вычисление квадратного корня из числа
     * @return - результат извлечения квадратного корня из числа
     */

    public double getSqrt (){

        return Math.sqrt(c);

    }

}
