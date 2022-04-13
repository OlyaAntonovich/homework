package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {


    private long count;

    @Override
    public void setAB(double a, double b) {
        super.setAB(a, b);
    }


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
    public void setFD(double f, int d) {
        super.setFD(f, d);
    }


    @Override
    public double getStep() {
        count++;
        return super.getStep();
    }


    @Override
    public void setC(double c) {
        super.setC(c);
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
