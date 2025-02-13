/*1. File Handling - Read and Write a Text File
📌 Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
*/
package com.streams.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteATextFile {
    public static void main(String[] args) {
        //Try block
        try(FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\filehandling\\read.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\filehandling\\write.txt")) {
            int data;
            while((data = fis.read()) != -1){
                fos.write(data);
            }
        }
        //Catch block
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}