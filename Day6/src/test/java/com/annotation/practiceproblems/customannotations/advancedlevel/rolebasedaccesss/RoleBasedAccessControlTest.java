package com.annotation.practiceproblems.customannotations.advancedlevel.rolebasedaccesss;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class RoleBasedAccessControlTest extends TestCase {
    @Test
    public void testAdminAccessAllowed() throws Exception {
        SecureOperations operations = new SecureOperations();
        Method method = SecureOperations.class.getDeclaredMethod("performAdminTask");

        RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
        assertNotNull(annotation); // Ensure annotation is present
        assertEquals("ADMIN", annotation.value()); // Check role requirement
    }

    @Test
    public void testUserAccessDenied() throws Exception {
        SecureOperations operations = new SecureOperations();
        Method method = SecureOperations.class.getDeclaredMethod("performAdminTask");
        RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);

        assertNotNull(annotation);
        assertNotEquals("USER", annotation.value()); // Ensure USER role is denied
    }
}