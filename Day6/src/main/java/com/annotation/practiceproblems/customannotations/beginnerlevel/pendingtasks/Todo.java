package com.annotation.practiceproblems.customannotations.beginnerlevel.pendingtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//Creating custom annotation to mark pending tasks
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task();
    //Defining task description
    String assignedTo();
    //Defining responsible developer
    String priority() default "MEDIUM";
    //Defining priority level with default value MEDIUM
}