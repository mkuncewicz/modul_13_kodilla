package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtrasDecorator extends AbstractPizzaOrderDecorator {

    String extrasName;

    public ExtrasDecorator(PizzaOrder pizzaOrder, String extrasName) {
        super(pizzaOrder);
        this.extrasName = extrasName;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + " + extrasName;
    }
}
