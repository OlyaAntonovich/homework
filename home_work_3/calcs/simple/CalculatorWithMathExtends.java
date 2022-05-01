package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
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
        return Math.pow (f,d);
    }

    @Override
    public void setC(double c) {
        super.setC(c);
    }

    @Override
    public double getAbs() {
        return Math.abs(c);
    }

    @Override
    public double getSqrt() {
        return Math.sqrt(c);
    }
}
