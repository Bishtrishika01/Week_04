package com.reflection.advancedlevel;

import java.lang.reflect.*;
import java.util.*;

class JsonConverter {
    public static String toJson(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            StringBuilder json = new StringBuilder("{");
            Field[] fields = clazz.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true); // Allowing access to private fields
                json.append("\"" + fields[i].getName() + "\": ")
                        .append(formatValue(fields[i].get(obj)));

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            }

            json.append("}");
            return json.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error converting object to JSON", e);
        }
    }

    private static String formatValue(Object value) {
        if (value instanceof String) {
            return "\"" + value + "\"";
        }
        return String.valueOf(value);
    }
}

class Persons {
    private String name;
    private int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonConverterExample {
    public static void main(String[] args) {

        Persons persons = new Persons("Rishika", 21);

        String json = JsonConverter.toJson(persons);
        System.out.println("JSON Representation: " + json);
    }
}
