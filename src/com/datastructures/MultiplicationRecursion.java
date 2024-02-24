package com.datastructures;

public class MultiplicationRecursion {

    static int c;

    public static int multiplyTwoIntegers(int m, int n) {
        // Write your code here
        c = m;
        return multiplyTwoIntegers(m, n, c);
    }

    private static int multiplyTwoIntegers(int m, int n, int a) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (a == 0) {
            return 0;
        }

        int smallAns = multiplyTwoIntegers(m, n, a - 1);

        return smallAns + n;
    }

    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(15, 14));
    }
}
