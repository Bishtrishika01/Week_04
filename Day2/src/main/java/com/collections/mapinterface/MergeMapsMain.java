/*Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.*/
package com.collections.mapinterface;

import java.util.HashMap;
import java.util.Map;
class MergeMaps {

    public static Map<String, Integer> mergeTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Copying map1 into mergedMap
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Iterating through map2 and merging values
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        // Return statement
        return mergedMap;
    }
}
public class MergeMapsMain {
    public static void main(String[] args) {
        // Defining the first map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Defining the second map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merging the two maps
        Map<String, Integer> mergedMap = MergeMaps.mergeTwoMaps(map1, map2);

        // Printing the merged map
        System.out.println("Merged Map: " + mergedMap);
    }
}
