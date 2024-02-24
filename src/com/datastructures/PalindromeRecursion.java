package com.datastructures;

public class PalindromeRecursion {

    public static boolean palindromeRecursion(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return palindromeRecursion(str.substring(1, str.length()-1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindromeRecursion("aslama"));
    }
}
