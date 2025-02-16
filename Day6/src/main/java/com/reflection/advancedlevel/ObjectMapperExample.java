package com.reflection.advancedlevel;

import java.lang.reflect.*;
import java.util.*;

class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Creating a new instance of the given class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterating through fields
            for (Field field : clazz.getDeclaredFields()) {
                if (properties.containsKey(field.getName())) {
                    field.setAccessible(true); // Allowing access to private fields
                    field.set(instance, properties.get(field.getName())); // Setting field value
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error mapping properties to object", e);
        }
    }
}

class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectMapperExample {
    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 25);

        Person person = CustomObjectMapper.toObject(Person.class, properties);

        System.out.println(person);
    }
}
