package com.annotation.practiceproblems.customannotations.beginnerlevel.pendingtasks;

import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        //Getting all methods from ProjectTasks
        Method[] methods = ProjectTasks.class.getDeclaredMethods();

        //Iterating through methods to find annotated ones
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                //Retrieving annotation details
                Todo annotation = method.getAnnotation(Todo.class);
                //Printing task details
                System.out.println("Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
                System.out.println();
            }
        }
    }
}
