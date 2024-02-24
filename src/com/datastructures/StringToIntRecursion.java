package com.datastructures;

public class StringToIntRecursion {

    public static int convertStringToInt(String input) {
        if (input.length() == 1) {
            return input.charAt(0) - '0';
        }

        int smallAns = convertStringToInt(input.substring(1));
        int x = input.charAt(0) - '0';
        x = x * (int) Math.pow(10, input.length() - 1) + smallAns;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(convertStringToInt("00001231"));
    }
}
