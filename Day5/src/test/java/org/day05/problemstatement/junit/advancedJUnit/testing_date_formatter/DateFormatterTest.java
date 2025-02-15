package org.day05.problemstatement.junit.advancedJUnit.testing_date_formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    private DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    void testValidDateConversion() {
        assertEquals("15-02-2024", dateFormatter.formatDate("2024-02-15"));
        assertEquals("01-01-2025", dateFormatter.formatDate("2025-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate("15-02-2024");
        });
        assertEquals("Invalid date format", exception.getMessage());
    }

    @Test
    void testEmptyString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate("");
        });
        assertEquals("Invalid date format", exception.getMessage());
    }
}