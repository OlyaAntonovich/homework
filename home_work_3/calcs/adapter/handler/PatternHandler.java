package home_work_3.calcs.adapter.handler;

import home_work_3.calcs.adapter.handler.api.IHandler;


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
        do {
            Matcher matcher = this.pattern.matcher(expresion);
            isMatch = matcher.find();
            if (isMatch){
                double result = calc(matcher);
                do {
                    expresion=expresion.replace(matcher.group(), String.valueOf(result));
                } while (expresion.contains(matcher.group()));

            }
        } while (isMatch);

        return expresion;
    }

    protected abstract double calc(Matcher matcher);

}
