package org.day05.problemstatement.junit.basicJUnittest.testingstringutilitymethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void reverseTest(){
        String str="sachin";
        assertEquals("nihcas",StringUtils.reverse(str));
        assertEquals("hello",StringUtils.reverse("olleh"));
    }
    @Test
    void isPalindromeTest() {
        assertFalse(StringUtils.isPalindrome("sachin"));
        assertTrue(StringUtils.isPalindrome("laal"));
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }
    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("WORLD", StringUtils.toUpperCase("World"));
        assertEquals("JAVA", StringUtils.toUpperCase("JaVa"));
        assertEquals("", StringUtils.toUpperCase("")); // Empty string test
    }

}