package org.day05.problemstatement.junit.advancedJUnit.testing_password_strength;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private PasswordValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Secure123"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Ab1"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("secure123"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("SecurePass"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(validator.isValid(""));
    }
}