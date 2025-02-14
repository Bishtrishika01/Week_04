//7.finally Block Execution
//        💡 Problem Statement:
//        Write a program that performs integer division and demonstrates the finally block execution.
//        The program should:
//        Take two integers from the user.
//        Perform division.
//        Handle ArithmeticException (if dividing by zero).
//        Ensure "Operation completed" is always printed using finally.
//        Expected Behavior:
//        If valid, print the result.
//        If an exception occurs, handle it and still print "Operation completed".

package com.exceptionhandling.finallyblockexecution;
import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}
