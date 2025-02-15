/*1️⃣2️⃣ Extract Programming Language Names from a Text
🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go*/
package org.day05.problemstatement.regex.advancedproblems.extractprogramminglanguagenamesfromtext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageNamesFromText {
    public static void main(String[] args) {
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex="(Java|Python|JavaScript|Go)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
