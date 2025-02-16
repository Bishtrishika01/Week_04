package com.annotation.excercise.useddeprecated;

// Define a class LegacyAPI.
public class LegacyAPI {
    // Mark oldFeature() as @Deprecated.
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature: This method is deprecated.");
    }
    // New method
    public void newFeature() {
        System.out.println("New feature: Use this method instead.");
    }
}