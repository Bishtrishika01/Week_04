package com.streams.datastreams;

import java.io.*;

public class DataStreams {
    // Method to store student details in a binary file
    public static void storeStudentDetails() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\datastreams\\students.txt"))) {
            // Writing student details (roll number, name, GPA)
            dos.writeInt(1);
            dos.writeUTF("Rishika");
            dos.writeDouble(7.5);

            dos.writeInt(2);
            dos.writeUTF("Alice");
            dos.writeDouble(8.1);

            dos.writeInt(3);
            dos.writeUTF("Bob");
            dos.writeDouble(9.8);

            System.out.println("Student details have been successfully stored in the binary file.");
        } catch (IOException e) {
            System.out.println("Error storing student details: " + e.getMessage());
        }
    }

    // Method to retrieve and display student details from a binary file
    public static void retrieveStudentDetails() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\datastreams\\students.txtt"))) {
            System.out.println("Retrieving student details from the binary file:");

            // Reading student details
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error retrieving student details: " + e.getMessage());
        }
    }
}
