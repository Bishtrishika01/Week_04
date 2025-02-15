package org.day05.problemstatement.junit.basicJUnittest.testingexceptionhandling;

public class TestingExceptionHandling {
        public static int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
}
