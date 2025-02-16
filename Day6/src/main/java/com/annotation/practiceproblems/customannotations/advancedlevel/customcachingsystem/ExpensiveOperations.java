package com.annotation.practiceproblems.customannotations.advancedlevel.customcachingsystem;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveOperations {
    private static final Map<Integer, Integer> cache = new HashMap<>();
    //Creating cache storage

    //Applying annotation to cache results
    @CacheResult
    public int computeSquare(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Returning cached result for: " + number);
            return cache.get(number);
        }
        System.out.println("Computing square for: " + number);
        int result = number * number;
        cache.put(number, result);
        //Storing result in cache
        return result;
    }
}