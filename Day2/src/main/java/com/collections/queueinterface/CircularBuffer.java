package com.collections.queueinterface;

import java.util.Arrays;

class CircularBuffer {
    private int[] queue;
    private int size, head, tail, count;
    public CircularBuffer(int size) {
        this.size = size;
        this.queue = new int[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    //Insert an element into the buffer
    public void enqueue(int value) {
        queue[tail] = value;
        // Circular increment
        tail = (tail + 1) % size;

        if (count < size) {
            count++;
        } else {
            head = (head + 1) % size;
        }
    }

    // Get buffer elements
    public int[] getBuffer() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = queue[(head + i) % size];
        }
        return result;
    }

    // Print buffer state in required format
    public void printBuffer() {
        System.out.println("Buffer: " + Arrays.toString(getBuffer()));
    }
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        // Insert elements
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4);

        // Print final buffer state
        buffer.printBuffer();
    }

}