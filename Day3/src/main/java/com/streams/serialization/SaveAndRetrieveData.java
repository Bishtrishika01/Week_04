/*4. Serialization - Save and Retrieve an Object
 Problem Statement:
Design a Java program that allows a user to store a list of employees in a file using Object Serialization and
later retrieve the data from the file.
Requirements:
Create an Employee class with fields: id, name, department, salary.
Serialize the list of employees into a file (ObjectOutputStream).
Deserialize and display the employees from the file (ObjectInputStream).
Handle ClassNotFoundException and IOException.
*/

package com.streams.serialization;

import java.io.*;

public class SaveAndRetrieveData {
    public static void main(String[] args) {
        // creating employee object
        Employee e1= new Employee("Rishika",101,"Testing",450000.0);


        // creating objectOutputStream and FileOutputStream to serialize the object to the file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\serialization\\writeObject.txt",true))) {
            oos.writeObject(e1);
            System.out.println("Employee saved successfully to " );
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }

        // ObjectInputStream and FileInputStream used for deserializing the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\serialization\\writeObject.txt"))) {
            //storing the object into its Class type
            Employee printe1= (Employee) ois.readObject();
            System.out.println("Printing user employee data : ");
            System.out.println(printe1.toString());
         }
        // handling the exception
        catch (Exception e) {
            System.out.println(" Fie not found " + e.getMessage());
        }


    }
}
