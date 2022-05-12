package home_work_4.home_work_3.calcs.adapter;

import home_work_4.home_work_3.calcs.adapter.handler.AddHandler;
import home_work_4.home_work_3.calcs.adapter.handler.DelHandler;
import home_work_4.home_work_3.calcs.adapter.handler.PlusHandler;
import home_work_4.home_work_3.calcs.adapter.handler.api.IHandler;
import home_work_4.home_work_3.calcs.api.ICalculator;
import home_work_4.home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.Objects;
import java.util.PriorityQueue;

public class CalculatorAdapter {
    private final ICalculator calculator;
    private final PriorityQueue <IHandler> queHandler = new PriorityQueue<>((o1, o2) ->
            o2.getPriority()-o1.getPriority());

    public CalculatorAdapter() {

        this.calculator = new CalculatorWithMathExtends();
        this.queHandler.add (new PlusHandler(this.calculator));
        this.queHandler.add (new AddHandler(this.calculator));
        this.queHandler.add (new DelHandler(this.calculator));

    }

    public double calc (String expression){

        for (IHandler handler : queHandler) {
            expression= handler.handle(expression);
        }

        return Double.parseDouble(expression);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorAdapter that = (CalculatorAdapter) o;
        return Objects.equals(calculator, that.calculator) && Objects.equals(queHandler, that.queHandler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculator, queHandler);
    }
}
