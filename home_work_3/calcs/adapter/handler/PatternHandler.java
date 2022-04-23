package home_work_3.calcs.adapter.handler;

import home_work_3.calcs.adapter.handler.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddHandler implements IHandler {
    private final ICalculator calculator;
    private final Pattern pattern;

    public AddHandler(ICalculator calculator) {
        this.calculator = calculator;
        this.pattern = Pattern.compile("(\\d{1,}) * \\*  *(\\d{1,})");
    }

    @Override
    public String handle(String expresion) {
        boolean isMatch = false;
        do {Matcher matcher = this.pattern.matcher(expresion);
            isMatch = matcher.find();
            if (matcher.find()){
                String operand1 = matcher.group(1);
                String operand2 = matcher.group(2);
                calculator.setAB(Double.valueOf(operand1),Double.valueOf(operand2));
                double result = calculator.getProizv();
                expresion=expresion.replaceAll(matcher.group(), String.valueOf(result));
            }

        } while (isMatch);


        return expresion;
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
