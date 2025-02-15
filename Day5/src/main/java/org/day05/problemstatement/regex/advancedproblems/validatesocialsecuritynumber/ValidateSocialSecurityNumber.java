/*1️⃣5️⃣ Validate a Social Security Number (SSN)
🔹 Example Input:
"My SSN is 123-45-6789."
🔹 Expected Output:
✅ "123-45-6789" is valid
❌ "123456789" is invalid*/
package org.day05.problemstatement.regex.advancedproblems.validatesocialsecuritynumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static void main(String[] args) {
        String text="My SSN is 123-45-6789.";
        String regex="[0-9-]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
               System.out.print(matcher.group());
        }
    }
}
