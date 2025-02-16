package com.annotation.practiceproblems.customannotations.advancedlevel.customcachingsystem;

public class CacheTest {
    public static void main(String[] args) throws Exception {
        ExpensiveOperations operations = new ExpensiveOperations();

        //Invoking method multiple times to test caching
        System.out.println("Result: " + operations.computeSquare(5));
        System.out.println("Result: " + operations.computeSquare(5));
        //Should return cached result
        System.out.println("Result: " + operations.computeSquare(10));
        System.out.println("Result: " + operations.computeSquare(10));
        //Should return cached result
    }
}

