/*Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.*/
package com.collections.listinterface;

import java.util.LinkedList;

public class FindNthElementFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        var fast = list.listIterator();
        var slow = list.listIterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) return null;
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        System.out.println(findNthFromEnd(list, N));
    }
}

