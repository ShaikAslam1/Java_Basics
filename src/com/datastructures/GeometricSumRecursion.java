package com.datastructures;

public class GeometricSumRecursion {


    public static double findGeometricSum(int k) {
        if (k == 0) {
            return 1;
        }

        double smallAns = findGeometricSum(k-1);
        double a = (1/Math.pow(2,k));
//        return smallAns+(1/Math.pow(2,k));
        return smallAns + a;
    }


    public static void main(String[] args) {
        System.out.println(findGeometricSum(3));
    }
}
