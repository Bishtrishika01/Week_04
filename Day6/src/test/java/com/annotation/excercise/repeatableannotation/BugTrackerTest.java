package com.annotation.excercise.repeatableannotation;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BugTrackerTest extends TestCase {
    @Test
    // test method
    public void testBugReportAnnotation() throws Exception {
        Method method = BugTracker.class.getMethod("fixBugs"); // get method
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class); // get annotations

        assertNotNull(bugReports); // check not null
        assertEquals(2, bugReports.length); // check count
        assertEquals("Null pointer exception occurs", bugReports[0].description()); // check first
        assertEquals("Performance issue in data processing", bugReports[1].description()); // check second
    }
}