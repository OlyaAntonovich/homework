package home_work_4.home_work_3.calcs.additional;

import home_work_4.home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_4.home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_4.home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithOperator calcWO;
    private CalculatorWithMathCopy calcMC;
    private CalculatorWithMathExtends calcME;


    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calcWO){

        this.calcWO = calcWO;
    }

    public CalculatorWithCounterAutoAgregation (CalculatorWithMathCopy calcMC){

        this.calcMC = calcMC;
    }

    public CalculatorWithCounterAutoAgregation (CalculatorWithMathExtends calc){

        this.calcME = calcME;
    }

    private long count;
    double a;
    double b;



    public void setAB (double a,double b){

        if(calcWO != null){
            calcWO.setAB(a, b);
        } else if (calcMC!= null){
            calcMC.setAB(a, b);
        } else {calcME.setAB(a, b);}
    }


    public double getProizv() {
        count++;

        if(calcWO != null){
        return calcWO.getProizv();
        } else if (calcMC!= null){
            return calcMC.getProizv();
        } else {return calcME.getProizv();}

    }

    public double getDel() {
        count++;
        if(calcWO != null){
            return calcWO.getDel();
        } else if (calcMC!= null){
            return calcMC.getDel();
        } else {return calcME.getDel();}

    }

    public void setFD(double f, int d) {

        if(calcWO != null){
            calcWO.setFD(f, d);
        } else if (calcMC!= null){
            calcMC.setFD(f, d);
        } else {calcME.setFD(f, d);}

    }

    public double getStep() {
        count++;
        if(calcWO != null){
            return calcWO.getStep();
        } else if (calcMC!= null){
            return calcMC.getStep();
        } else {return calcME.getStep();}

    }

    public double getSumm() {
        count++;

        if(calcWO != null){
            return calcWO.getSumm();
        } else if (calcMC!= null){
            return calcMC.getSumm();
        } else {return calcME.getSumm();}
    }


    public void setC (double c) {

        if(calcWO != null){
            calcWO.setC(c);
        } else if (calcMC!= null){
            calcMC.setC(c);
        } else {calcME.setC(c);}
    }

    public double getSubtract() {
        count++;

        if(calcWO != null){
            return calcWO.getSubtract();
        } else if (calcMC!= null){
            return calcMC.getSubtract();
        } else {return calcME.getSubtract();}
    }

    public double getAbs() {
        count++;

        if(calcWO != null){
            return calcWO.getAbs();
        } else if (calcMC!= null){
            return calcMC.getAbs();
        } else {return calcME.getAbs();}

    }

    public double getSqrt() {
        count++;
        if(calcWO != null){
            return calcWO.getSqrt();
        } else if (calcMC!= null){
            return calcMC.getSqrt();
        } else {return calcME.getSqrt();}

    }

        public long getCountOperation (){

            return count;
        }


    }




