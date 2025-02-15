package org.day05.problemstatement.junit.basicJUnittest.testingstringutilitymethods;

public class StringUtils {
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            sb.append(ch);

        }
        return sb.toString();

    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while (left<right){
            if ((str.charAt(left)!=str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
        public static String toUpperCase(String str) {
            return str.toUpperCase();
        }

}
