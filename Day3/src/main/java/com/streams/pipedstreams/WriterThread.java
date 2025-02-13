package com.streams.pipedstreams;


import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
    private PipedOutputStream out;

    public WriterThread(PipedOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                out.write(("Message " + i + "\n").getBytes());
                out.flush();
                System.out.println("WriterThread: \"Message " + i + "\" written.");
                Thread.sleep(100); // Simulating some delay
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("WriterThread: " + e.getMessage());
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                System.err.println("WriterThread: Error closing output stream - " + e.getMessage());
            }
        }
    }
}