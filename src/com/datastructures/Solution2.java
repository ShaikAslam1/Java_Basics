package com.datastructures;

import java.util.Scanner;

public class Solution2 {
    private static int index = 0;

    public static int lastIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        return lastIndex(input, x, 0);
    }

    private static int lastIndex(int[] input, int x, int start) {

        if (input.length == 0)
            return -1;

        if (start == input.length) {
            if (index > 0) {
                return index;
            }
            return -1;
        }

        if (input[start] == x) {
            index = start;
            if (start + 1 == input.length) {
                return index;
            }
        }

        return lastIndex(input, x, start + 1);
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(Solution2.lastIndex(input, x));
    }
}
