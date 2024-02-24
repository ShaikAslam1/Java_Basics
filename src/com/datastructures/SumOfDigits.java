package com.datastructures;

public class SumOfDigits {

    public static int sumOfDigits(int input) {
        if (input == 0) {
            return input;
        }

        int smallResult = sumOfDigits(input / 10);

        return smallResult + (input % 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
