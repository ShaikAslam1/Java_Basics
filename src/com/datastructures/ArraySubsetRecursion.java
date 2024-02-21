package com.datastructures;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraySubsetRecursion {

    public static int[][] subsets(int[] input) {
        return subsets(input, 0);
    }

    public static int[][] subsets(int[] input, int si) {
        if (si >= input.length) {
            int[][] ans = new int[1][0];
            return ans;
        }
        int[][] smallAns = subsets(input, si + 1);
        int[][] ans = new int[smallAns.length * 2][];
        int k = 0;

        // add element at ith array
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                ans[i][j] = smallAns[i][j];
            }
            k++;
        }

        // add element at k+i th array
        for (int i = 0; i < smallAns.length; i++) {
            ans[k + i] = new int[smallAns[i].length + 1];
            ans[k + i][0] = input[si];
            for (int j = 1; j <= smallAns[i].length; j++) {
                ans[i + k][j] = smallAns[i][j - 1];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input = {15, 20, 12};
        int[][] answer = subsets(input);
        for (int[] ans : answer) {
            for (int anInt : ans) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
