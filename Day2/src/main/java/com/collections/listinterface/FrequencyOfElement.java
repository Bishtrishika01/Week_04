/*Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.*/
package com.collections.listinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FrequencyOfElement {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = countFrequency(list);

        System.out.println(frequencyMap);
    }

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }
}
