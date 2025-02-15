package org.day05.problemstatement.junit.basicJUnittest.testingacalculatorclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void calculatorAddTest(){
        Calculator calculator=new Calculator();
        int actual=calculator.add(2,2);
        assertEquals(4,actual);
    }@Test
    void calculatorSubTest(){
        Calculator calculator=new Calculator();
        int actual=calculator.subtract(2,2);
        assertEquals(0,actual);
    }@Test
    void calculatorMultiTest(){
        Calculator calculator=new Calculator();
        int actual=calculator.multiply(2,2);
        assertEquals(4,actual);
    }@Test
    void calculatorDivideTest(){
        Calculator calculator=new Calculator();
        int actual=calculator.divide(4,2);
        assertEquals(2,actual);
    }
}