package com.annotation.practiceproblems.customannotations.beginnerlevel.markimportantmethods;

import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        //Getting all methods from ImportantClass
        Method[] methods = ImportantClass.class.getDeclaredMethods();

        //Iterating through methods to find annotated ones
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                //Retrieving annotation details
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                //Printing method name and priority level
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}