package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoComposite {

    private CalculatorWithCounterAutoSuper calcComposite;

    private long count;
    double a;
    double b;

    public CalculatorWithCounterAutoComposite () {
        this.calcComposite = new CalculatorWithCounterAutoSuper();

    }

    public void setAB (double a,double b){
        calcComposite.setAB(a, b);
    }


    public double getProizv() {
        this.count++;
        return calcComposite.getProizv();

    }

    public double getDel() {
        count++;
        return calcComposite.getDel();
    }

    public void setFD(double f, int d) {

        calcComposite.setFD(f, d);
    }

    public double getStep() {
        count++;
        return calcComposite.getStep();
    }


    public double getSumm() {
        count++;
        return calcComposite.getSumm();
    }

    public long getCountOperation (){

        return calcComposite.getCountOperation();
    }

    public void setC(double c) {

        calcComposite.setC(c);
    }

    public double getSubtract() {
        count++;

        return calcComposite.getSubtract();
    }

    public double getAbs() {
        count++;
        return calcComposite.getAbs();
    }

    public double getSqrt() {
        count++;

        return calcComposite.getSqrt();
    }









}
