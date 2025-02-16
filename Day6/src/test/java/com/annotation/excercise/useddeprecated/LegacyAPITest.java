package com.annotation.excercise.useddeprecated;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LegacyAPITest extends TestCase {
    @Test
    // test method
    public void testOldFeature() {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.oldFeature();
        assertTrue(true);
    }

    @Test // test method
    public void testNewFeature() {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.newFeature();
        assertTrue(true);
    }
}