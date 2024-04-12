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

    public static boolean isPalindrome2(String palindrome){
        int panjang = palindrome.length();
        boolean isEven = panjang % 2 == 0;

        int x = 0;
        int y = palindrome.length()-1;

        if(isEven){
            int mid = panjang/2;
            while (x < mid){
                if(palindrome.charAt(x) != palindrome.charAt(y)){
                    return false;
                }
                x++;
                y--;
            }
        }else{
            while(x != y)
            {
                System.out.println(x);
                if (palindrome.charAt(x) != palindrome.charAt(y)) {
                    return false;
                }

                x++;
                y--;
            }
        }
        return true;
    }
}
