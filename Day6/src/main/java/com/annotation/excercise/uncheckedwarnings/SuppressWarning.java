package com.annotation.excercise.uncheckedwarnings;

import java.util.ArrayList;

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //Creating an ArrayList without generics
        ArrayList list = new ArrayList();
        //Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        //Printing the list
        System.out.println(list);
    }
}
