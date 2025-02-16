package com.annotation.practiceproblems.customannotations.beginnerlevel.markimportantmethods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Creating custom annotation to mark important methods
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethod {
    String level() default "HIGH";
    //Defining priority level with default value HIGH
}