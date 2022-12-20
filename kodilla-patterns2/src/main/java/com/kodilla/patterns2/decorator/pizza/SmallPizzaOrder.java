package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SmallPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getDescription() {
        return "Mała pizza - sos pomidorowy, ser";
    }
}
