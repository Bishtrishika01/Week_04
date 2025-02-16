package com.annotation.excercise.repeatableannotation;

import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("fixBugs");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bugReport : bugReports) {
            System.out.println("Bug Description: " + bugReport.description());
        }
    }
}