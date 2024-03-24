package com.datastructures;

import java.util.Arrays;

public class FindNumTripletSum {

    public static int tripletSum(int[] arr, int targetSum) {
        // Your code goes here
        int count = 0;
        int n = arr.length;

        // Sort the array to make finding triplets easier
        Arrays.sort(arr);

        // Fix the first element and use two-pointer approach for the remaining elements
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == targetSum) {
                    count++;
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0};
        int targetSum = 5;
        System.out.println(tripletSum(arr, targetSum));
    }
}
