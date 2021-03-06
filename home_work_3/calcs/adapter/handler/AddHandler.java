package home_work_3.calcs.adapter.handler;

import home_work_3.calcs.adapter.handler.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class AddHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;

    public AddHandler(ICalculator calculator) {
        super("(\\d{1,}(\\.\\d{1,}){0,1}) *\\* *(\\d{1,}(\\.\\d{1,}){0,1})");
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {

        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        calculator.setAB(Double.parseDouble(operand1),Double.parseDouble(operand2));
        double proizv = calculator.getProizv();
        return proizv;
    }



    @Override
    public int getPriority() {
        return 4;
    }
}
