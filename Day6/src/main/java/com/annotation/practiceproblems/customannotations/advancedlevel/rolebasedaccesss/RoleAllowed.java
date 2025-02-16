package com.annotation.practiceproblems.customannotations.advancedlevel.rolebasedaccesss;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String value();
    //Defining role required for method access
}
