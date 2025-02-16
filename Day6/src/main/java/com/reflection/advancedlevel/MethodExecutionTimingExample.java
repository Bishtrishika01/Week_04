package com.reflection.advancedlevel;

import java.lang.reflect.*;

class MethodTimer {
    public static void measureExecutionTime(Object obj, String methodName, Class<?>[] paramTypes, Object... args) {
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName, paramTypes);
            method.setAccessible(true); // Allowing access to private methods

            long startTime = System.nanoTime(); // Recording start time
            Object result = method.invoke(obj, args); // Invoking method dynamically
            long endTime = System.nanoTime(); // Recording end time

            System.out.println("Execution time for " + methodName + ": " + (endTime - startTime) + " nanoseconds");
            if (result != null) {
                System.out.println("Method result: " + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class MethodExecutionTimingExample {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        MethodTimer.measureExecutionTime(mathOps, "add", new Class[]{int.class, int.class}, 5, 10);
        MethodTimer.measureExecutionTime(mathOps, "multiply", new Class[]{int.class, int.class}, 6, 7);
    }
}
