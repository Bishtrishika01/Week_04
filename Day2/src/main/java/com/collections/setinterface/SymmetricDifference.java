/*Symmetric Difference
Find the symmetric difference (elements present in either set but not in both) of two sets.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.*/
package com.collections.setinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;


public class SymmetricDifference {
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> symmetricDiff = findSymmetricDifference(set1, set2);

        System.out.println("Output: " + symmetricDiff);
    }
}
