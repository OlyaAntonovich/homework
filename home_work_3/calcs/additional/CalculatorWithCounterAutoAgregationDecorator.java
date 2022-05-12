package home_work_4.home_work_3.calcs.additional;

import home_work_4.home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationDecorator implements ICalculator {

    private ICalculator icalculator;
    private long count;
    double a;
    double b;


    public CalculatorWithCounterAutoAgregationDecorator(ICalculator icalculator){

        this.icalculator = icalculator;
    }

    public ICalculator getIcalculator (){
        return this.icalculator;
    }

    @Override
    public void setAB (double a,double b){

        this.icalculator.setAB(a, b);
    }
    @Override
    public double getProizv() {
        count++;

         return this.icalculator.getProizv();

    }
    @Override
    public double getDel() {
        count++;

        return this.icalculator.getDel();
    }
    @Override
    public void setFD(double f, double d) {

        this.icalculator.setFD(f, d);

    }
    @Override
    public double getStep() {
        count++;

       return this.icalculator.getStep();

    }
    @Override
    public double getSumm() {
        count++;
        return this.icalculator.getSumm();
    }

    @Override
    public void setC (double c) {

        this.icalculator.setC(c);
    }
    @Override
    public double getSubtract() {
        count++;

        return this.icalculator.getSubtract();
    }
    @Override
    public double getAbs() {
        count++;

        return this.icalculator.getAbs();

    }
    @Override
    public double getSqrt() {
        count++;
        return this.icalculator.getSqrt();

    }

        public long getCountOperation (){

            return count;
        }



    }




