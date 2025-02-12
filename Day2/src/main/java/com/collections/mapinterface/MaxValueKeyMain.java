/*Find the Key with the Highest Value
Given a Map<String, Integer>, find the key with the maximum value.
Example:
Input: {A=10, B=20, C=15} → Output: B.*/
package com.collections.mapinterface;

import java.util.HashMap;
import java.util.Map;

class MaxValueKeyFinder {

    // Defining a method for finding the key with the highest value
    public static String findMaxValueKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null; // Handling empty or null map
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Iterating through each entry in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        // Returning the key with the highest value
        return maxKey;
    }
}

public class MaxValueKeyMain {
    public static void main(String[] args) {
        // Defining the input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Finding the key with the highest value
        String maxKey = MaxValueKeyFinder.findMaxValueKey(inputMap);

        // Printing the result
        System.out.println("Key with highest value: " + maxKey);
    }
}
