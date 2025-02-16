package com.annotation.practiceproblems.customannotations.intermediatelevel.fieldvalidation;

import java.lang.reflect.Field;

class User {
    @MaxLength(10)
    private String username;

    //Creating constructor to validate field length
    public User(String username) {
        if (username.length() > getMaxLength("username")) {
            throw new IllegalArgumentException("Username exceeds maximum length of " + getMaxLength("username"));
        }
        this.username = username;
    }

    //Creating method to retrieve max length from annotation
    private int getMaxLength(String fieldName) {
        try {
            Field field = this.getClass().getDeclaredField(fieldName);
            if (field.isAnnotationPresent(MaxLength.class)) {
                return field.getAnnotation(MaxLength.class).value();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return Integer.MAX_VALUE;
    }
}