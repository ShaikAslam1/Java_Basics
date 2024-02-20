package com.datastructures;

public class BinarySearchRecursion {


    public static int binarySearch(int[] input, int element) {

        return helper(input, element, 0, input.length - 1);
    }

    private static int helper(int[] input, int element, int start, int end) {
        if (start >= end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (element == input[mid]) {
            return mid;
        } else if (element < input[mid]) {
            return helper(input, element, start, mid-1);
        } else {
            return helper(input, element, mid+1, end);
        }
    }


    public static void main(String[] args) {

    }
}
