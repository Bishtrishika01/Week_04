/*9️⃣ Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words."*/
package org.day05.problemstatement.regex.replacecensorbadwordsinsentence;

public class CensorBadWordsInSentence {
    public static void main(String[] args) {
        String text="This is a damn bad example with some stupid words.";
        String regex="\\b(damn|stupid)\\b";
        String result = text.replaceAll(regex, "****");
        System.out.println(text);
        System.out.println(result);
    }
}
