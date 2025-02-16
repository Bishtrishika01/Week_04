package com.annotation.practiceproblems.customannotations.advancedlevel.rolebasedaccesss;

public class SecureOperations {
    //Allowing only ADMIN role to access this method
    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task executed.");
    }
}