package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private  Calculator calculator;

    @Test
    void testCalculations(){
        //Given

        //When
        double result1 = calculator.add(5,4);
        double result2 = calculator.sub(5,2);
        double result3 = calculator.mul(2,2);
        double result4 = calculator.div(5,2.5);
        //Then
        Assertions.assertEquals(9,result1);
        Assertions.assertEquals(3,result2);
        Assertions.assertEquals(4,result3);
        Assertions.assertEquals(2,result4);
    }
}
