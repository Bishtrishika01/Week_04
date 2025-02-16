package com.annotation.practiceproblems.customannotations.advancedlevel.rolebasedaccesss;

import java.lang.reflect.Method;

public class RoleBasedAccessControl {
    public static void main(String[] args) throws Exception {
        SecureOperations operations = new SecureOperations();
        String currentUserRole = "USER"; //Simulating current user role

        //Getting all methods from SecureOperations
        Method[] methods = SecureOperations.class.getDeclaredMethods();

        //Iterating through methods to check access
        for (Method method : methods) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
                if (annotation.value().equals(currentUserRole)) {
                    method.invoke(operations);
                } else {
                    System.out.println("Access Denied!");
                }
            }
        }
    }
}
