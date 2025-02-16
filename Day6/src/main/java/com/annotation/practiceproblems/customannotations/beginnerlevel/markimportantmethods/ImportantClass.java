package com.annotation.practiceproblems.customannotations.beginnerlevel.markimportantmethods;

//Creating class with important methods
public class ImportantClass {
    //Marking method as important with default priority level
    @ImportantMethod
    public void criticalOperation() {
        System.out.println("Executing critical operation");
    }

    //Marking method as important with MEDIUM priority level
    @ImportantMethod(level = "MEDIUM")
    public void secondaryOperation() {
        System.out.println("Executing secondary operation");
    }
}