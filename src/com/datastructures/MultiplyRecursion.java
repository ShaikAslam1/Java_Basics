package com.datastructures;

public class MultiplyRecursion {

    public static int multiplyTwoIntegers(int m, int n) {
        if (n == 0) {
            return 0;
        }

        int smallAns = multiplyTwoIntegers(m, n-1);

        return m + smallAns;
    }

    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(3, 4));
    }
}
