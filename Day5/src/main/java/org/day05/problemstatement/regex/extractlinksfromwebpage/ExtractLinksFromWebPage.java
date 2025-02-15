/*7️⃣ Extract Links from a Web Page
🔹 Example Text:
"Visit https://www.google.com and http://example.org for more info."
🔹 Expected Output:
https://www.google.com, http://example.org*/
package org.day05.problemstatement.regex.extractlinksfromwebpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPage {
    public static void main(String[] args) {
        String text="Visit https://www.google.com and http://example.org for more info.";
        String regex="https?://(www\\.)?[A-Za-z0-9.-]+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
