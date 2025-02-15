/*8️⃣ Replace Multiple Spaces with a Single Space
🔹 Example Input:
"This is an example with multiple spaces."
🔹 Expected Output:
"This is an example with multiple spaces."*/
package org.day05.problemstatement.regex.replacemultiplespaceswithasinglespace;

public class MultipleSpacesWithSingleSpace {
    public static void main(String[] args) {
        String text="This is   an example with   multiple  spaces";
        String regex="\\s+";
        String result = text.replaceAll(regex, " ");
        System.out.println(text);
        System.out.println(result);

    }
}
