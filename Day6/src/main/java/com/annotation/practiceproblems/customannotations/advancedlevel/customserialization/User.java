package com.annotation.practiceproblems.customannotations.advancedlevel.customserialization;

import java.lang.reflect.Field;

public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    //Creating method to serialize object to JSON
    public String toJson() {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                try {
                    String key = field.getAnnotation(JsonField.class).name();
                    String value = (String) field.get(this);
                    json.append("\"" + key + "\": \"" + value + "\", ");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        if (json.length() > 1) {
            json.setLength(json.length() - 2); //Removing last comma
        }
        json.append("}");
        return json.toString();
    }
}