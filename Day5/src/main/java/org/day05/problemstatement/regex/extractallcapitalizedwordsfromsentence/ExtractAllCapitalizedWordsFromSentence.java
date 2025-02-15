/*5️⃣ Extract All Capitalized Words from a Sentence
🔹 Example Text:
"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
🔹 Expected Output:
Eiffel, Tower, Paris, Statue, Liberty, New, York*/
package org.day05.problemstatement.regex.extractallcapitalizedwordsfromsentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWordsFromSentence {
    public static void main(String[] args) {
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex="[A-Z][a-z]+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }

    }
}
