/*🔟 Validate an IP Address
A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.*/
package org.day05.problemstatement.regex.advancedproblems.validateanIPaddress;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateAnIPAddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a valid IPv4 address :");
        String ip=sc.nextLine();
        String regex= "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        if (Pattern.matches(regex,ip)){
            System.out.println(ip+" Valid!");
        }else {
            System.out.println(ip+" Invalid!");
        }

    }
}
