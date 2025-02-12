/*Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].*/
package com.collections.listinterface;

import java.util.*;

public class RotateElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;

        rotateList(list, k);

        System.out.println(list);
    }

    public static void rotateList(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;

        for (int i = 0; i < k; i++) {
            list.add(list.remove(0));
        }
    }
}
