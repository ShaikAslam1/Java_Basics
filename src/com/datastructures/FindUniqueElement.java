package com.datastructures;

public class FindUniqueElement {

    public static int findUnique(int[] arr) {
        // Your code goes here
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3};
        System.out.println(findUnique(arr));
    }
}
