package com.datastructures;

import java.util.Arrays;

public class QuickSortRecursion {

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int pivotIndex = partition(input, startIndex, endIndex);

        quickSort(input, startIndex, pivotIndex - 1);
        quickSort(input, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] input, int startIndex, int endIndex) {
        int pivotElement = input[startIndex];
        int smallerNumCount = 0;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (input[i] < pivotElement) {
                smallerNumCount++;
            }
        }

        // keep the pivot element in its correct place
        int temp = input[startIndex + smallerNumCount];
        input[startIndex + smallerNumCount] = pivotElement;
        input[startIndex] = temp;

        int i = startIndex;
        int j = endIndex;

        while (i<j) {
            if (input[i] < pivotElement) {
                i++;
            } else if (input[j] >= pivotElement) {
                j--;
            } else {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        return startIndex + smallerNumCount;
    }

    public static void main(String[] args) {
        int[] input = {552, 95, 337, 413, 899, 784, 962, 432, 275, 586, 810, 685, 267, 814, 13, 190, 67, 201, 164,
                657, 462, 313, 310, 366, 848, 375, 751, 751};
//        int[] input = {4, 3, 8, 4, 6, 5};
        quickSort(input, 0, input.length - 1);
        Arrays.stream(input).forEach(e -> System.out.print(e + " "));
    }
}
