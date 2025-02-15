/*1️⃣3️⃣ Extract Currency Values from a Text
        🔹 Example Text:
        "The price is $45.99, and the discount is 10.50."
        🔹 Expected Output:
        $45.99, 10.50*/
package org.day05.problemstatement.regex.advancedproblems.extractcurrencyvaluesfromtext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValuesFromText {
    public static void main(String[] args) {
        String text="The price is $45.99, and the discount is 10.50.";
        String regex="\\$?\\d+.\\d{2}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
