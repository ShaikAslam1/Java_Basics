package com.practice;

import java.util.* ;
import java.io.*;

class Solution {

    public static String stringReverse(char[] arr) {
        // Write your code here.
        int a = 0;
        char[] arr2 = new char[arr.length];
        String result = "";
        for (int i=arr.length-1; i>=0; --i) {
            arr2[a] = arr[i];
            ++a;
        }
        return Arrays.toString(arr2)
                .replace("[", "").replace(",", "").replace("]", "")
                .replace(" ","");
    }
}

public class StringReverse {
    public static void main(String[] args) {
        char[] arr = {'g','g', 'U', 'M'};
        System.out.println(Solution.stringReverse(arr));
    }
}