package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWhithCounterClassic extends CalculatorWithMathExtends {

    @Override
    public void setAB(double a, double b) {
        super.setAB(a, b);
    }

    @Override
    public double getDel() {
        return super.getDel();
    }

    @Override
    public double getSumm() {
        return super.getSumm();
    }

    @Override
    public double getSubtract() {
        return super.getSubtract();
    }

    @Override
    public double getProizv() {
        return super.getProizv();
    }

    @Override
    public void setFD(double f, int d) {
        super.setFD(f, d);
    }

    @Override
    public double getStep() {
        return super.getStep();
    }

    @Override
    public void setC(double c) {
        super.setC(c);
    }

    @Override
    public double getAbs() {
        return super.getAbs();
    }

    @Override
    public double getSqrt(int c) {
        return super.getSqrt(c);
    }

    long count = 1;

    public void incrementCountOperation (long count){

        this.count = count;
    }

    public long getCountOperation (){

        count = count +1;

        return (count);
    }
}
