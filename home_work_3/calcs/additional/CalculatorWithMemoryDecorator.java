package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

import java.util.ArrayList;

public class CalculatorWithMemoryDecorator  implements ICalculator
         {

    private ICalculator icalculator;

    public CalculatorWithMemoryDecorator(ICalculator icalculator){

        this.icalculator = icalculator;
    }

    private long count;
    double a;
    double b;
    /**
     * создаем автоматически расширяемый массив ArrayList
     */
    public ArrayList <Double> memories = new ArrayList();
    public double memory;

    public ICalculator getIcalculator (){

        return this.icalculator;
             }

    @Override

    public void setAB (double a,double b){

        this.icalculator.setAB(a, b);
    }

    /**
     * метод, результат работы которого произведение двух чисел
     * count -счетчик
     * memories.add(icalculator.getProizv()) - добавление объекта в массив ArrayList
     * @return произведение двух чисел
     */
    @Override
    public double getProizv() {
        count++;
        memories.add(this.icalculator.getProizv());

         return this.icalculator.getProizv();
    }

    /**
     * метод, результат работы которого частное от деления двух чисел
     * count -счетчик
     * memories.add(icalculator.getDel()) - добавление объекта в массив ArrayList
     * @return частное от деления двух чисел
     */

    @Override
    public double getDel() {
        count++;
        memories.add(this.icalculator.getDel());
        return this.icalculator.getDel();
    }
    @Override
    public void setFD(double f, int d) {

        this.icalculator.setFD(f, d);

    }

    /**
     * метод, результат работы которого возведение в степень числа
     * count -счетчик
     * memories.add(icalculator.getStep()) - добавление объекта в массив ArrayList
     * @return возведение в степень числа
     */
    @Override
    public double getStep() {
        count++;
        memories.add(this.icalculator.getStep());
       return this.icalculator.getStep();

    }

    /**
     * метод, результат работы которого сумма двух чисел
     * count -счетчик
     * memories.add(icalculator.getSumm()) - добавление объекта в массив ArrayList
     * @return сумма двух чисел
     */
    @Override
    public double getSumm() {
        count++;
        memories.add(this.icalculator.getSumm());
        return this.icalculator.getSumm();
    }

    @Override
    public void setC (double c) {

        this.icalculator.setC(c);
    }

    /**
     * метод, результат работы которого разница двух чисел
     * count -счетчик
     * memories.add(icalculator.getSubtract()) - добавление объекта в массив ArrayList
     * @return сумма двух чисел
     */
    @Override
    public double getSubtract() {
        count++;
        memories.add(this.icalculator.getSubtract());
        return this.icalculator.getSubtract();
    }
    /**
     * метод, результат работы которого модуль числа
     * count -счетчик
     * memories.add(icalculator.getAbs()) - добавление объекта в массив ArrayList
     * @return модуль числа
     */
    @Override
    public double getAbs() {
        count++;

        return this.icalculator.getAbs();

    }
    /**
     * метод, результат работы которого квадратный корень из  числа
     * count -счетчик
     * memories.add(icalculator.getAbs()) - добавление объекта в массив ArrayList
     * @return квадратный корень из  числа
     */

    @Override
    public double getSqrt() {
        count++;
        memories.add(this.icalculator.getSqrt());
        return this.icalculator.getSqrt();

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




