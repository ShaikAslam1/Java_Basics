package com.fuctional;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{45, 51, 28, 75, 49, 42}));
        System.out.println(secondLargest(new int[]{985, 521, 975, 831, 479, 861}));
        System.out.println(secondLargest(new int[]{9459, 9575, 5692, 1305, 1942, 9012}));
        System.out.println(secondLargest(new int[]{47498, 14526, 74562, 42681, 75283, 45796}));
    }

    static int secondLargest(int[] array) {
        int firstLargest, secondLargest;
        if (array[0] > array[1]) {
            firstLargest = array[0];
            secondLargest = array[1];
        } else {
            firstLargest = array[1];
            secondLargest = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] < firstLargest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}
