package home_work_3.calcs.adapter.handler;

import home_work_3.calcs.adapter.handler.api.IHandler;
import home_work_3.calcs.api.ICalculator;

public class AddHandler implements IHandler {
    private final ICalculator calculator;

    public AddHandler(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public String handle(String expresion) {
        return null;
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
