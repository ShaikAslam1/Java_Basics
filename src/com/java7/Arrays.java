package com.java7;

public class Arrays {
    public static void main(String[] args) {
        int[][] array2D = {
                {0,1,2},
                {3,4,5,6}
        };
        System.out.println(array2D[0].length + " ");
        System.out.println(array2D[1].getClass().isArray() + " ");
        System.out.println(array2D[0][1]);

        System.out.println(array2D[0][3]);


    }
}
