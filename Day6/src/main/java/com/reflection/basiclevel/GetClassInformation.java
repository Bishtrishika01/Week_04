package com.reflection.basiclevel;

import java.lang.reflect.*;
import java.util.Scanner;

public class GetClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();
        scanner.close();

        try {

            Class<?> clazz = Class.forName(className);
            System.out.println("Class: " + clazz.getName());

            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : clazz.getConstructors()) {
                System.out.println(constructor);
            }

            System.out.println("\nFields:");
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                System.out.println(field);
            }

            System.out.println("\nMethods:");
            for (Method method : clazz.getDeclaredMethods()) {
                method.setAccessible(true);
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}
