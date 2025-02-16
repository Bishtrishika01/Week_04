package com.annotation.excercise.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Defining custom annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface TaskInfo {
    String priority();
    String assignedTo();
}