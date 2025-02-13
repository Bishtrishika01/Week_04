package com.streams.bufferedstreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingBufferedStreams {
    public static void usingBufferedStreams() {
        //Try block
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\bufferedstreams\\Read1mb.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Java Fundamental\\Week4\\Day3\\src\\main\\java\\com\\streams\\bufferedstreams\\Write1.txt"))) {
            //Using chunks of 4 KB (4096 bytes)
            byte[] buffer = new byte[4096];
            int len;

            while ((len = bis.read(buffer))!= -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("File read complete using Buffered Stream.");
        }
        //Catch block
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
