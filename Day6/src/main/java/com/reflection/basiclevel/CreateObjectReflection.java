package com.reflection.basiclevel;

import java.lang.reflect.*;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class CreateObjectReflection {
    public static void main(String[] args) {
        try {
            // Getting Class object
            Class<?> clazz = Student.class;

            // Accessing constructor
            Constructor<?> constructor = clazz.getConstructor(String.class);

            // Creating instance dynamically
            Student student = (Student) constructor.newInstance("Alice");

            // Calling method
            student.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
