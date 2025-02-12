//Generate Binary Numbers Using a Queue
//Generate the first N binary numbers (as strings) using a queue.
//Example:
//N=5 → Output: ["1", "10", "11", "100", "101"].
package com.collections.queueinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GeneratingBinaryNumber {
    public  List<String> generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        // Start with the first binary number "1"
        queue.add("1");

        for (int i = 0; i < N; i++) {
            // Get and remove the front element
            String binary = queue.poll();
            // Store the result in the list
            result.add(binary);

            // Generate next binary numbers and enqueue them
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        // Return the list of binary numbers
        return result;
    }
    public static void main(String[] args) {
        int number =5;
        //object of class
        GeneratingBinaryNumber generatingBinaryNumber = new GeneratingBinaryNumber();
        //method call and store result
        List<String> answer = generatingBinaryNumber.generateBinaryNumbers(number);
        //displaying the result
        System.out.println(answer);
    }
}
