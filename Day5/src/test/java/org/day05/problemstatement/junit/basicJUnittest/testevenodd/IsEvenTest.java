package org.day05.problemstatement.junit.basicJUnittest.testevenodd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void isEvenTest(int number){
        IsEven isEven=new IsEven();
        boolean actual= isEven.isEven(number);
        assertTrue(actual);

    }
    @ParameterizedTest
    @ValueSource(ints = {3,7})
    void isOddTest(int number){
        IsEven isEven=new IsEven();
        boolean actual= isEven.isEven(number);
        assertFalse(actual);

    }
}