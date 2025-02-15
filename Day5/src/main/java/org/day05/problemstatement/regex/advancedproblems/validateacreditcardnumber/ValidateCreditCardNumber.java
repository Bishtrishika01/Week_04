/*1️⃣1️⃣ Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.*/
package org.day05.problemstatement.regex.advancedproblems.validateacreditcardnumber;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Credit Card Number :");
        String cardNumber=sc.nextLine();
        String regex="^(4\\d{15}|5\\d{15})$";
        if (Pattern.matches(regex,cardNumber)){
            if (cardNumber.charAt(0)=='4'){
                System.out.println("Visa card");
            }else{
                System.out.println("MasterCard");
            }
        }else{
            System.out.println("Invalid!");
        }

    }
}
