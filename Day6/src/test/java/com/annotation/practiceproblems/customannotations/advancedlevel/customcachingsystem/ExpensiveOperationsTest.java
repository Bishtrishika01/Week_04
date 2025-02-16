package com.annotation.practiceproblems.customannotations.advancedlevel.customcachingsystem;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpensiveOperationsTest extends TestCase {
    @Test
    public void testComputeSquareCaching() {
        ExpensiveOperations operations = new ExpensiveOperations();

        int firstCall = operations.computeSquare(5); // Compute
        int secondCall = operations.computeSquare(5); // Cached
        assertEquals(firstCall, secondCall); // Should be same

        int thirdCall = operations.computeSquare(10); // Compute
        int fourthCall = operations.computeSquare(10); // Cached
        assertEquals(thirdCall, fourthCall); // Should be same
    }
}