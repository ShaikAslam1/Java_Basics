package com.fuctional;

public class SumOfAllDigits {
    public static void main(String[] args) {
        sumOfAllDigits(123456789);
    }

    static void sumOfAllDigits(int digit) {
        int sumOfAllDigits = 0;
        while (digit > 0) {
            int lastDigit = digit % 10;
            sumOfAllDigits += lastDigit;
            digit = digit/10;
        }
        System.out.println("Sum of All Digits: " + sumOfAllDigits);
    }
}
