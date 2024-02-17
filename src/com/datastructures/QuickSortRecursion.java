package com.datastructures;

import java.util.Arrays;

public class QuickSortRecursion {

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int pivotPosition = partition(input, startIndex, endIndex);

        quickSort(input, startIndex, pivotPosition-1);
        quickSort(input, pivotPosition+1, endIndex);
    }

    private static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[startIndex];
        // count number of elements < p
        int count = 0;
        for (int i=startIndex+1; i<endIndex; i++) {
            if (input[i] < pivot) {
                count++;
            }
        }
        int pivotPos = startIndex + count;
        int temp = input[startIndex];
        input[startIndex] = input[pivotPos];
        input[pivotPos] = temp;

        int i = startIndex;
        int j = endIndex;

        while (i<pivotPos && j>pivotPos) {
            if (input[i]<=input[pivotPos]) {
                i++;
            } else if (input[j]>input[pivotPos]) {
                j--;
            } else {
                int temp_ = input[i];
                input[i] = input[j];
                input[j] = temp_;
                i++;j--;
            }
        }
        return pivotPos;
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 8, 4, 6, 5};
        quickSort(input, 0, input.length-1);
        Arrays.stream(input).forEach(System.out::print);
    }
}
