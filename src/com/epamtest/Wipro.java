package com.epamtest;

public class Wipro {

    // String "aabbcca"
    // a2b2c2a1

    public static void main(String[] args) {

        String input = "aabbcca";

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i=1; i<input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        result.append(currentChar).append(count);

        System.out.println(result);
    }

}

