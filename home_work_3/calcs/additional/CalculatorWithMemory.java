package home_work_4.home_work_3.calcs.additional;

import home_work_4.home_work_3.calcs.api.ICalculator;

import java.util.ArrayList;

public class CalculatorWithMemory {

    private ICalculator icalculator;

    public CalculatorWithMemory(ICalculator icalculator){

        this.icalculator = icalculator;
    }

    private long count;
    double a;
    double b;
    /**
     * создаем автоматически расширяемый массив ArrayList
     */
    private ArrayList <Double> memories = new ArrayList();
    double memory;



    public void setAB (double a,double b){

        icalculator.setAB(a, b);
    }

    /**
     * метод, результат работы которого произведение двух чисел
     * count -счетчик
     * memories.add(icalculator.getProizv()) - добавление объекта в массив ArrayList
     * @return произведение двух чисел
     */

    public double getProizv() {
        count++;
        memories.add(icalculator.getProizv());

         return icalculator.getProizv();
    }

    /**
     * метод, результат работы которого частное от деления двух чисел
     * count -счетчик
     * memories.add(icalculator.getDel()) - добавление объекта в массив ArrayList
     * @return частное от деления двух чисел
     */


    public double getDel() {
        count++;
        memories.add(icalculator.getDel());
        return icalculator.getDel();
    }

    public void setFD(double f, int d) {

        icalculator.setFD(f, d);

    }

    /**
     * метод, результат работы которого возведение в степень числа
     * count -счетчик
     * memories.add(icalculator.getStep()) - добавление объекта в массив ArrayList
     * @return возведение в степень числа
     */

    public double getStep() {
        count++;
        memories.add(icalculator.getStep());
       return icalculator.getStep();

    }

    /**
     * метод, результат работы которого сумма двух чисел
     * count -счетчик
     * memories.add(icalculator.getSumm()) - добавление объекта в массив ArrayList
     * @return сумма двух чисел
     */

    public double getSumm() {
        count++;
        memories.add(icalculator.getSumm());
        return icalculator.getSumm();
    }


    public void setC (double c) {

        icalculator.setC(c);
    }

    /**
     * метод, результат работы которого разница двух чисел
     * count -счетчик
     * memories.add(icalculator.getSubtract()) - добавление объекта в массив ArrayList
     * @return сумма двух чисел
     */

    public double getSubtract() {
        count++;
        memories.add(icalculator.getSubtract());
        return icalculator.getSubtract();
    }
    /**
     * метод, результат работы которого модуль числа
     * count -счетчик
     * memories.add(icalculator.getAbs()) - добавление объекта в массив ArrayList
     * @return модуль числа
     */

    public double getAbs() {
        count++;

        return icalculator.getAbs();

    }
    /**
     * метод, результат работы которого квадратный корень из  числа
     * count -счетчик
     * memories.add(icalculator.getAbs()) - добавление объекта в массив ArrayList
     * @return квадратный корень из  числа
     */


    public double getSqrt() {
        count++;
        memories.add(icalculator.getSqrt());
        return icalculator.getSqrt();

    }

    /**
     * метод, который считает количество вызовов математической функции
     * @return количество вызовов математической функции
     */

        public long getCountOperation (){

            return count;
        }

    /**
     * метод, который записывает в память результат работы
     * последней вызванной математической функции,
     * вызывая последний элемент массива ArrayList
     */
        public void Memory () {

            memory = memories.get(memories.size() - 1);
               }

    /**
     * метод, который вызывает из памяти последнее записанное в нее значение
     * @return последнее записанное в память значение
     */
    public double getMemory (){
        return memory;
    }

    }




