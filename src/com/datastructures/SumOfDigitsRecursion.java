package com.datastructures;

public class SumOfDigitsRecursion {


    public static int sumOfDigits(int input) {
        if (input == 0) {
            return 0;
        }

        int smallAns = sumOfDigits(input/10);
        input = input % 10;
        return smallAns + input;

        // 12345
    }


    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
