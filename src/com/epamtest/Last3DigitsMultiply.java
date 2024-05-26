package com.epamtest;

public class Last3DigitsMultiply {
    public static void main(String[] args) {
        System.out.println(last3DigitsMultiply(new int[] {1,2,3,4,5,6,7}));
    }

    static int last3DigitsMultiply(int[] array) {
        int count = 0;
        int lastThreeMultiply = 1;
        for (int i=array.length - 2; count < 3; i--) {
            lastThreeMultiply *= array[i];
            count++;
        }

        return lastThreeMultiply;
    }
}
