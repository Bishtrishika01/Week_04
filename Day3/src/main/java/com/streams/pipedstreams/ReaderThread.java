package com.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;


public class ReaderThread extends Thread {
    private PipedInputStream in;

    public ReaderThread(PipedInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                String receivedMessage = new String(buffer, 0, bytesRead);
                System.out.println("ReaderThread: " + receivedMessage);
            }
        } catch (IOException e) {
            System.err.println("ReaderThread: " + e.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.err.println("ReaderThread: Error closing input stream - " + e.getMessage());
            }
        }
    }
}