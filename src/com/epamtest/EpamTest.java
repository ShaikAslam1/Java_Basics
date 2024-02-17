package com.epamtest;

import java.util.Arrays;

public class EpamTest {
    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "?ab??a";
        String s2 = "bab??a";
        String s3 = "?a?";

        System.out.println(s.solution(s1)); // Output: "aabbaa"
        System.out.println(s.solution(s2)); // Output: "NO"
        System.out.println(s.solution(s3)); // Output: "aaa"
    }
}
class Solution {
    public String solution(String S) {
        // Implement your solution here
        char[] charArray = S.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;

            if (charArray[i] == '?' && charArray[j] == '?') {
                charArray[i] = 'a';
                charArray[j] = 'a';
            } else if (charArray[i] == '?' && charArray[j] != '?') {
                charArray[i] = charArray[j];
            } else if (charArray[i] != '?' && charArray[j] == '?') {
                charArray[j] = charArray[i];
            } else if (charArray[i] != charArray[j]) {
                return "NO";
            }
        }

        if (n % 2 == 1 && charArray[n / 2] == '?') {
            charArray[n / 2] = 'a';
        }

        return new String(charArray);
    }
}
