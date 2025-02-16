package com.annotation.practiceproblems.customannotations.intermediatelevel.fieldvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MaxLength {
    int value(); //Defining maximum length for a field
}
