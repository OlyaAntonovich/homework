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
    public void setFD(double f, double d) {
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
    public double getSqrt() {
        return super.getSqrt();
    }

    long count = 0;

    public void incrementCountOperation (){

        count = count+1;
    }

    public long getCountOperation (){

        return count;
    }
}
