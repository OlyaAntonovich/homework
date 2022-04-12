package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {


    private long count;

     @Override
    public double getProizv() {
        count++;
        return super.getProizv();

    }



    @Override
    public double getDel() {
        count++;
        return super.getDel();
    }

    @Override
    public double getSumm() {
       count++;
        return super.getSumm();
    }

    @Override
    public double getSubtract() {
        count++;

        return super.getSubtract();
    }


    @Override
    public double getStep() {
        count++;
        return super.getStep();
    }


    @Override
    public double getAbs() {
        count++;
        return super.getAbs();
    }

    @Override
    public double getSqrt() {
        count++;

        return super.getSqrt();
    }
    public long getCountOperation (){

        return count;
    }





}
