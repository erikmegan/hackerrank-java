package org.example;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if  (t.length() != s.length()) return false;

        int[] store = new int[26];
        for (int i = 0; i < s.length(); i++){
            store[s.charAt(i) - 'a']++;

            store[t.charAt(i) - 'a']--;
        }

        System.out.println(store);
        for (int n: store) if (n != 0) return  false;
        return true;

    }
}
