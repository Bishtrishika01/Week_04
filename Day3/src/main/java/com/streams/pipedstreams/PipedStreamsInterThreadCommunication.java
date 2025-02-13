/*8. Piped Streams - Inter-Thread Communication
📌 Problem Statement:
Implement a Java program where one thread writes data into a PipedOutputStream and another thread reads data from a PipedInputStream.
Requirements:
Use two threads for reading and writing.
Synchronize properly to prevent data loss.
Handle IOException.*/
package com.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


public class PipedStreamsInterThreadCommunication {
    public static void main(String[] args) {
        PipedOutputStream pipedOut = new PipedOutputStream();
        PipedInputStream pipedIn = new PipedInputStream();

        try {
            // Connecting the piped streams
            pipedIn.connect(pipedOut);

            // Creating and starting the writer thread
            WriterThread writerThread = new WriterThread(pipedOut);
            writerThread.start();

            // Creating and starting the reader thread
            ReaderThread readerThread = new ReaderThread(pipedIn);
            readerThread.start();

            // Waiting for the threads to finish
            writerThread.join();
            readerThread.join();

            System.out.println("Inter-thread communication completed successfully.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Main: " + e.getMessage());
        }
    }
}
