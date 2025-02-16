package com.annotation.excercise.repeatableannotation;

//Using annotation in BugTracker class
public class BugTracker {
    @BugReport(description = "Null pointer exception occurs")
    @BugReport(description = "Performance issue in data processing")
    public void fixBugs() {
        System.out.println("Fixing bugs");
    }
}
