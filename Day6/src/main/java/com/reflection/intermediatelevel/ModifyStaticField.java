package com.reflection.intermediatelevel;

import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "123456";
}

public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Configuration.class;

            Field field = clazz.getDeclaredField("API_KEY");
            field.setAccessible(true);

            // Printing original value
            System.out.println("Original API_KEY: " + field.get(null));

            // Modifying field value
            field.set(null, "NEW_API_KEY");

            // Printing modified value
            System.out.println("Modified API_KEY: " + field.get(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
