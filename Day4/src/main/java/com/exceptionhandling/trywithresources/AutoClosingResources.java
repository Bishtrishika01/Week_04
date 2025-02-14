//5. try-with-resources (Auto-closing Resources)
//💡 Problem Statement:
//Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
//Use try-with-resources to ensure the file is automatically closed after reading.
//Handle any IOException that may occur.
//Expected Behavior:
//If the file exists, print its first line.
//If the file does not exist, catch IOException and print "Error reading file".

package com.exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/exceptionhandling/trywithresources/info.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                System.out.println(line);
            }
            else {
                System.out.println("File is empty.");
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
