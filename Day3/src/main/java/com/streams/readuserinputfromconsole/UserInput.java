/*Read User Input from Console
📌 Problem Statement:
Write a program that asks the user for their name, age, and favorite programming language, then saves this information into a file.
Requirements:
Use BufferedReader for console input.
Use FileWriter to write the data into a file.
Handle exceptions properly.
*/
package com.streams.readuserinputfromconsole;

import java.io.*;

public class UserInput {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\readuserinputfromconsole\\Write.txt",true)) {

            // Taking input from user
            System.out.print("Enter your name: ");
            String name = read.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(read.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = read.readLine();

            // Writing data to the file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            writer.write("*************************************************"+"\n");

            System.out.println("Data saved successfully ");
        // handling exceptions
        } catch (IOException e) {
            System.out.println("File not found ");
        } catch (NumberFormatException e) {
            System.out.println(" Invalid input for age. Please enter a number.");
        }


    }
}
