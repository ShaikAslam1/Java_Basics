package com.datastructures;

import java.util.Arrays;

public class ReturnKeypadRecursion {

    public static String[] keypad(int n) {
        // Write your code here
        if (n == 0 || n == 1) {
            String[] ans = {""};
            return ans;
        }

        int num = n % 10;

        String[] ans = keypad(n / 10);

        String keyPadString = getString(num);

        String[] finalAnswer = new String[keyPadString.length() * ans.length];

        int k = 0;

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < keyPadString.length(); j++) {
                finalAnswer[k] = ans[i] + keyPadString.charAt(j);
                k++;
            }
        }

        return finalAnswer;
    }

    private static String getString(int digit) {
        if (digit == 2)
            return "abc";
        if (digit == 3)
            return "def";
        if (digit == 4)
            return "ghi";
        if (digit == 5)
            return "jkl";
        if (digit == 6)
            return "mno";
        if (digit == 7)
            return "pqrs";
        if (digit == 8)
            return "tuv";
        if (digit == 9)
            return "wxyz";

        return " ";
    }

    public static void main(String[] args) {
        String[] keypad = keypad(23);
        Arrays.stream(keypad).forEach(System.out::println);
    }
}
