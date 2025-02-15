package org.day05.problemstatement.junit.basicJUnittest.testinglistoperations;

import java.util.*;
public class TestingListOperations {
        public static void addElement(List<Integer> list, int element) {
            list.add(element);

        }

        public static boolean removeElement(List<Integer> list, int element) {
            return list.remove(Integer.valueOf(element)); // Removes only the first occurrence
        }

        public static int getSize(List<Integer> list) {
            return list.size();
        }

    public static void main(String[] args) {
           List<Integer> list=new ArrayList<>();
           addElement(list,2);
           addElement(list,1);
           addElement(list,6);
           addElement(list,8);
           addElement(list,5);

           removeElement(list,5);
           removeElement(list,6);
        System.out.println(list);

    }
}

