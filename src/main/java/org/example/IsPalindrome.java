package org.example;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        char[] c = s.replaceAll(
                "[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        for (int i = 0; i < c.length; i++){
            if (c[i] != c[c.length-1-i]) return false;
        }
        return true;
    }
}
