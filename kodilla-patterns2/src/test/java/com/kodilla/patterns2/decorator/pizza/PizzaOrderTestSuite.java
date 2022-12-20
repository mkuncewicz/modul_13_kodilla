package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {


    @Test
    void MediumPizzaTest(){

        PizzaOrder theOrder = new MediumPizzaOrder();

        theOrder = new ExtrasDecorator(theOrder, "papryka");

        BigDecimal cost = theOrder.getCost();
        String resultString = theOrder.getDescription();
        assertEquals(new BigDecimal(23), cost);
        assertEquals("Średnia pizza - sos pomidorowy, ser + papryka", resultString);
    }
    @Test
    void SmallPizzaTest(){

        PizzaOrder theOrder = new SmallPizzaOrder();

        theOrder = new ExtrasDecorator(theOrder, "papryka");
        theOrder = new ExtrasDecorator(theOrder, "bekon");

        BigDecimal cost = theOrder.getCost();
        String resultString = theOrder.getDescription();
        assertEquals(new BigDecimal(21), cost);
        assertEquals("Mała pizza - sos pomidorowy, ser + papryka + bekon", resultString);
    }

}
