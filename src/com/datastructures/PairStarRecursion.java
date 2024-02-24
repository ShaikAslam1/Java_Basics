package com.datastructures;

public class PairStarRecursion {

    public static String addStars(String input) {
        if (input.length() == 1) {
            return input;
        }

        String smallAns = addStars(input.substring(1));

        if (input.charAt(0) == input.charAt(1)) {
            smallAns = input.charAt(0) + "*" + input.charAt(1) + smallAns.substring(1);
        } else {
            smallAns = input.charAt(0) + smallAns;
        }
        return smallAns;
    }

    // better solution
//    public static String addStars(String input) {
//        if (input.length() == 1)
//            return input;
//        String smallAns = addStars(input.substring(1));
//        if (input.charAt(0) == smallAns.charAt(0))
//            return input.charAt(0) + "*" + smallAns;
//        else
//            return input.charAt(0) + smallAns;
//    }

    public static void main(String[] args) {
        System.out.println(addStars("hello"));
    }
}
