package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handler.AddHandler;
import home_work_3.calcs.adapter.handler.PlusHandler;
import home_work_3.calcs.adapter.handler.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.PriorityQueue;

public class CalculatorAdapter {
    private final ICalculator calculator;
    private final PriorityQueue <IHandler> queHandler = new PriorityQueue<>((o1, o2) ->
            o2.getPriority()-o1.getPriority());

    public CalculatorAdapter() {

        this.calculator = new CalculatorWithMathExtends();
        queHandler.add (new AddHandler(this.calculator));
        queHandler.add (new PlusHandler(this.calculator));
    }

    public double calc (String expression){

        for (IHandler handler : queHandler) {
            expression= handler.handle(expression);
        }

        return Double.valueOf(expression);
    }
}
