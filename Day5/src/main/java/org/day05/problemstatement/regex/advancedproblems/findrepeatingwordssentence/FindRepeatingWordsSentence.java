/*1️⃣4️⃣ Find Repeating Words in a Sentence
🔹 Example Input:
"This is is a repeated repeated word test."
🔹 Expected Output:
is, repeated*/
package org.day05.problemstatement.regex.advancedproblems.findrepeatingwordssentence;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWordsSentence {
    public static void main(String[] args) {
        String text="This is is a repeated repeated word test.";
        String regex="\\w+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        HashSet<String> set=new HashSet<>();
        while (matcher.find()){
          if (set.add(matcher.group())){

            }else{
              System.out.print(matcher.group()+" ");
          }

        }

    }
}
