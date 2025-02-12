/*Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].*/
package com.collections.listinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class RemoveDuplicate {

    public static List<Integer> removeDuplicates(List<Integer> inputList) {
        Set<Integer> seen = new HashSet<>();
        ListIterator<Integer> iterator = inputList.listIterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (!seen.add(current)) {
                iterator.remove();
            }
        }
        return inputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(List.of(3, 1, 2, 2, 3, 4));
        List<Integer> outputList = removeDuplicates(inputList);
        System.out.println("Output: " + outputList);

    }
}

