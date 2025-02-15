/*3️⃣ Validate a Hex Color Code
A valid hex color:
Starts with a #
Followed by 6 hexadecimal characters (0-9, A-F, a-f).
🔹 Example Inputs & Outputs
✅ "#FFA500" → Valid
✅ "#ff4500" → Valid
❌ "#123" → Invalid (too short)*/
package org.day05.problemstatement.regex.validatehexcolorcode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Hex Color Code: ");
        String haxCode=scanner.nextLine();
        scanner.close();
        String regex="^[#][0-9A-Fa-f]{6}";
        if (Pattern.matches(regex,haxCode)){
            System.out.println(haxCode+" Valid!");
        }else {
            System.out.println(haxCode+" Invalid!");
        }
    }
}
