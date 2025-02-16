package com.annotation.practiceproblems.customannotations.advancedlevel.customserialization;

import junit.framework.TestCase;
import org.junit.Test;

public class JsonSerializerTestTest extends TestCase {
    @Test
    public void testUserToJson() {
        User user = new User("Vivek Sahu", "merebhai@example.com");
        String json = user.toJson();

        assertTrue(json.contains("\"user_name\": \"Vivek Sahu\"")); // Check username
        assertTrue(json.contains("\"user_email\": \"merebhai@example.com\"")); // Check email
    }
}