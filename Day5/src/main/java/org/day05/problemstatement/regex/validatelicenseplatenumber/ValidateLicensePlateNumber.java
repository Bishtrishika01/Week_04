/*2️⃣ Validate a License Plate Number
License plate format: Starts with two uppercase letters, followed by four digits.
Example: "AB1234" is valid, but "A12345" is invalid.*/
package org.day05.problemstatement.regex.validatelicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a License Plate Number: ");
        String number=scanner.nextLine();
        scanner.close();

        String regex="^[A-Z]{2}[0-9]{4}";

        if (Pattern.matches(regex,number)){
            System.out.println(number+" Valid!");
        }else {
            System.out.println(number+" Invalid!");
        }
    }
}
