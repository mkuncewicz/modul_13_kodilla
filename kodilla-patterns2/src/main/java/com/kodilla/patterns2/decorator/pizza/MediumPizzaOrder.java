package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MediumPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20.00);
    }

    @Override
    public String getDescription() {
        return "Średnia pizza - sos pomidorowy, ser";
    }
}
