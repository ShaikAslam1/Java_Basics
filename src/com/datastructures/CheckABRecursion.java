package com.datastructures;

public class CheckABRecursion {

    public static boolean checkAB(String input) {
        if (input.length() == 0) {
            return true;
        }

        if (input.charAt(0) == 'a') {
            if (input.length() > 2 && input.substring(1, 3).equals("bb")) {
                return checkAB(input.substring(3));
            } else {
                return checkAB(input.substring(1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkAB("abb"));
        System.out.println(checkAB("abababa"));
        System.out.println(checkAB("abbabbabba"));
        System.out.println(checkAB("abbabbabbabbabbabbab"));
    }
}
