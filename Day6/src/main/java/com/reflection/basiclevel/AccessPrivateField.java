package com.reflection.basiclevel;

import java.lang.reflect.*;

class Person {
    private int age = 25;
}

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            // Creating Person object
            Person person = new Person();

            // Getting Class object
            Class<?> clazz = person.getClass();

            // Accessing private field
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true); // Allowing access to private field

            // Getting and printing the original value
            System.out.println("Original Age: " + ageField.get(person));

            // Modifying the field value
            ageField.set(person, 30);

            // Getting and printing the modified value
            System.out.println("Modified Age: " + ageField.get(person));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
