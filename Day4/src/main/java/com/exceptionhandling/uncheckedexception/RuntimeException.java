//2. Unchecked Exception (Runtime Exception)
//💡 Problem Statement:
//Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
//ArithmeticException if division by zero occurs.
//InputMismatchException if the user enters a non-numeric value.
//Expected Behavior:
//If the user enters valid numbers, print the result of the division.
//If the user enters 0 as the denominator, catch and handle ArithmeticException.
//If the user enters a non-numeric value, catch and handle InputMismatchException.
package com.exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class RuntimeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 1st integer");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd integer");
            int num2 = sc.nextInt();
            int div = num1 / num2;
            System.out.println("Divisible by "+num2+" and "+num1+" is "+div);
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("ArithmeticException occurred " + arithmeticException.getMessage());
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("InputMismatchException occurred " + inputMismatchException.getMessage());
        }
    }
}
