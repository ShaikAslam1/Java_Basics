package com.datastructures;

public class FindGeometricSumRecursion {

    static int a = 1;
    public static double findGeometricSum(int k) {
        if (k == 0) {
            return 1;
        }

        double smallAns = findGeometricSum(k - 1);
        double pow = Math.pow(2, a++);
        return smallAns + (1 / pow);
    }

    public static void main(String[] args) {
        System.out.println(findGeometricSum(3));
    }
}
