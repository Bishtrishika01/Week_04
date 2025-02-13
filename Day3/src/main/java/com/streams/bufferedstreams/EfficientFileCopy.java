/*2. Buffered Streams - Efficient File Copy
📌 Problem Statement:
Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.
Requirements:
Read and write in chunks of 4 KB (4096 bytes).
Use System.nanoTime() to measure execution time.
Compare execution time with unbuffered streams.*/
package com.streams.bufferedstreams;

public class EfficientFileCopy {
    public static void main(String[] args) {
        //Using Buffered Streams
        long start = System.nanoTime();
        UsingBufferedStreams.usingBufferedStreams();
        long end = System.nanoTime();
        double timeTaken1 = (end - start)/1000000.0;
        System.out.println("Performance using BufferedStream - " + timeTaken1 + " ms");

        //Using Unbuffered stream
        start = System.nanoTime();
        UsingUnbufferedStream.usingUnbufferedStream();
        end = System.nanoTime();
        double timeTaken2 = (end - start)/1000000.0;
        System.out.println("Performance using UnbufferedStream - " + timeTaken2 + " ms");

        if(timeTaken1>timeTaken2){
            System.out.println("UnbufferedStream is fast");
        }
        else if(timeTaken2>timeTaken1){
            System.out.println("BufferedStream is fast");
        }
    }
}
