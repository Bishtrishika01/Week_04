package com.reflection.intermediatelevel;

import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            Class<?> clazz = MathOperations.class;
            Object obj = clazz.getDeclaredConstructor().newInstance();

            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            scanner.close();

            // Accessing method dynamically
            Method method = clazz.getMethod(methodName, int.class, int.class);
            int result = (int) method.invoke(obj, num1, num2);

            // Printing the result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
