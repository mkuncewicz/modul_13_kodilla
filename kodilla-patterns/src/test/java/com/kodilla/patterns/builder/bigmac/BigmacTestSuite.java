package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {


    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce("1000 WYSP")
                .bun(true)
                .burgers(2)
                .ingredient("Onion")
                .ingredient("Ham")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(2, howManyIngredients);
        Assertions.assertEquals(2, bigmac.getBurgers());
    }
}
