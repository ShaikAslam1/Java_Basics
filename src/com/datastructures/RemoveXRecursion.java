package com.datastructures;

public class RemoveXRecursion {


    public static String removeX(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.charAt(0) == 'x')
            return removeX(str.substring(1));

        else
            return str.charAt(0) + removeX(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "abxdx";
        System.out.println(removeX(str));
    }
}
