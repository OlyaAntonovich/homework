package home_work_3.calcs.adapter.handler;

import home_work_3.calcs.adapter.handler.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternHandler implements IHandler {

    private final Pattern pattern;

    public PatternHandler(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public final String handle(String expresion) {
        boolean isMatch = false;
        do {Matcher matcher = this.pattern.matcher(expresion);
            isMatch = matcher.find();
            if (matcher.find()){

                double result = calc(matcher);
                expresion=expresion.replaceAll(matcher.group(), String.valueOf(result));
            }
        } while (isMatch);

        return expresion;
    }

    protected abstract double calc(Matcher matcher);

}
