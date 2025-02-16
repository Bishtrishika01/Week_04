package com.annotation.practiceproblems.customannotations.intermediatelevel.loggingmethodexecusion;

import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();

        //Getting all methods from PerformanceTest
        Method[] methods = PerformanceTest.class.getDeclaredMethods();

        //Iterating through methods to find annotated ones
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                System.out.println("Executing method: " + method.getName());
                method.invoke(test);
                System.out.println();
            }
        }
    }
}
