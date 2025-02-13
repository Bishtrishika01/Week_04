package com.streams.bufferedstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingUnbufferedStream {
    public static void usingUnbufferedStream() {
        //Try block
        try(FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\bufferedstreams\\Read1mb.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\bufferedstreams\\Write2.txt")) {
            //Using chunks of 4 KB (4096 bytes)
            byte[] buffer = new byte[4096];

            int len;
            while((len = fis.read(buffer))!=-1){
                fos.write(buffer, 0, len);
            }
            System.out.println("File read complete using UnBuffered Stream.");
        }
        //Catch block
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
