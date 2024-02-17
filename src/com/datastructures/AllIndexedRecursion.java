package com.datastructures;

import java.util.Arrays;

public class AllIndexedRecursion {

    static int[] answer = new int[4];

    public static int[] allIndexes(int input[], int x) {
        return helperFunction(input, x, 0);
    }

    // 9 8 10 8 8
    private static int[] helperFunction(int input[], int x, int str) {
        if (input.length == str) {
            int[] output = new int[0];
            return output;
        }

        int smallAns[] = helperFunction(input, x, str + 1);
        if (input[str] == x) {
            int answer[] = new int[smallAns.length + 1];
            answer[0] = str;
            // arrange indexes in increasing order
            for (int i = 0; i < smallAns.length; i++) {
                answer[i + 1] = smallAns[i];
            }
            return answer;
        } else {
            return smallAns;
        }
    }


    public static void main(String[] args) {
        int[] input = {9, 8, 10, 8, 8};
        int x = 8;
        Arrays.stream(allIndexes(input, x)).forEach(System.out::println);
    }
}
