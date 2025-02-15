/*4️⃣ Extract All Email Addresses from a Text
🔹 Example Text:
"Contact us at support@example.com and info@company.org"
🔹 Expected Output:
support@example.com
info@company.org*/
package org.day05.problemstatement.regex.extractallemailaddressesfromtext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddressesFromText {
    public static void main(String[] args) {
        String text="Contact us at support@example.com and info@company.org";
        String regex="[A-Za-z0-9._+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
