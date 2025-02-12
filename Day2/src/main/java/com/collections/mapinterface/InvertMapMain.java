/*Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
*/
package com.collections.mapinterface;

import java.util.*;

class InvertMap {

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}
public class InvertMapMain {
    public static void main(String[] args) {

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = InvertMap.invertMap(inputMap);

        System.out.println("Inverted Map: " + invertedMap);
    }
}
