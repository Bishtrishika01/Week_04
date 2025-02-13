//Read a Large File Line by Line
//📌 Problem Statement:
//Develop a Java program that efficiently reads a large text file (500MB+) line by line and prints only
// lines containing the word "error".
//Requirements:
//Use BufferedReader for efficient reading.
//Read line-by-line instead of loading the entire file.
//Display only lines containing "error" (case insensitive).

package com.streams.readalargefilelinebyline;

import java.io.*;

public class ReadAFileLineByLine {
    public static void main(String[] args) {
        //create file path to read
        File filePath = new File("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\readalargefilelinebyline\\TestingFile.txt");
        //perform operations with handling try catch block
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line;
            //read the file line by line
            while((line = br.readLine())!=null){
                //if line contains word "error" return the whole line
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
            }
        }
        //handling the exception
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
