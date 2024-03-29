package com.datastructures;

public class PermutationRecursion {

    public static String[] permutationOfString(String input) {
        // Write your code here
        if (input.length() == 0) {
            String y[] = {""};
            return y;
        }

        String[] ans = permutationOfString(input.substring(1));
        // char ch = input.charAt(0);
        String output[] = new String[ans.length * input.length()];

        int k = 0;
        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j <= ans[i].length(); j++) {
                output[k++] = ans[i].substring(0, j) + input.charAt(0) + ans[i].substring(j);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        String[] result = permutationOfString("abc");
        for (String r: result) {
            System.out.println(r);
        }
    }
}
