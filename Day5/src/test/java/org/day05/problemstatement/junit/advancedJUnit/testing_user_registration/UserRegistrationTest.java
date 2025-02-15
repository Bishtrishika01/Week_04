package org.day05.problemstatement.junit.advancedJUnit.testing_user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    private UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!", userRegistration.registerUser("JohnDoe", "john.doe@example.com", "Secure123"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("", "john.doe@example.com", "Secure123");
        });
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    void testInvalidEmailFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("JohnDoe", "invalid-email", "Secure123");
        });
        assertEquals("Invalid email format.", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("JohnDoe", "john.doe@example.com", "Pass1");
        });
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    void testPasswordWithoutUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("JohnDoe", "john.doe@example.com", "password1");
        });
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    void testPasswordWithoutDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password");
        });
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit.", exception.getMessage());
    }
}