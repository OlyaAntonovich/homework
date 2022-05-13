package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    private ICalculator icalculator;


    public CalculatorWithCounterAutoAgregationInterface(ICalculator icalculator) {

        this.icalculator = icalculator;
    }


    private long count;
    double a;
    double b;


    public void setAB(double a, double b) {

        icalculator.setAB(a, b);
    }


    public double getProizv() {
        count++;

        return icalculator.getProizv();

    }

    public double getDel() {
        count++;

        return icalculator.getDel();
    }

    public void setFD(double f, int d) {

        icalculator.setFD(f, d);

    }

    public double getStep() {
        count++;

        return icalculator.getStep();

    }

    public double getSumm() {
        count++;
        return icalculator.getSumm();
    }

    public void setC(double c) {
        icalculator.setC(c);
    }

    public double getSubtract() {
        count++;
        return icalculator.getSubtract();

    }

    public double getAbs() {
        count++;
        return icalculator.getAbs();

    }

    public double getSqrt() {
        count++;
        return icalculator.getSqrt();

    }

    public long getCountOperation() {
        return count;

    }

}




