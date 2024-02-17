package com.datastructures;

import java.util.Scanner;

public class Solution3 {
    private static int index = 0;

    public static int lastIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        return lastIndexBetter(input, x, 0);
    }

    public static int lastIndexBetter(int a[], int x, int si) {
        if(si==a.length){
            return -1;
        }
        int k=lastIndexBetter(a,x,si+1);
        if(k!=-1){
            return k;
        }else{
            if(a[si]==x){
                return si;
            }else{
                return -1;
            }
        }
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
        System.out.println(Solution3.lastIndex(input, x));
    }
    /*
    if s.le == 0 or s.l == 1 true
    if a[0] != a[l- 1] false
    return f(s.substring(1, n-1));
     */
}
