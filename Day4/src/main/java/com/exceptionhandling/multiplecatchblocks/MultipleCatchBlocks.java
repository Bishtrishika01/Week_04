//4. Multiple Catch Blocks
//💡 Problem Statement:
//Create a Java program that performs array operations.
//Accept an integer array and an index number.
//Retrieve and print the value at that index.
//Handle the following exceptions:
//ArrayIndexOutOfBoundsException if the index is out of range.
//NullPointerException if the array is null.
//Expected Behavior:
//If valid, print "Value at index X: Y".
//If the index is out of bounds, display "Invalid index!".
//If the array is null, display "Array is not initialized!".

package com.exceptionhandling.multiplecatchblocks;

import java.util.Scanner;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            arr = null;
            System.out.println("Enter an index of the element for retrieval: ");
            int index = sc.nextInt();
            System.out.print( "Value at index " + index + ": " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! - " + e.getMessage());
        }
        catch(NullPointerException e) {
            System.out.println("Array is not initialized! " + e.getMessage());
        }
    }
}
