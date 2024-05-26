package com.fuctional;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2, 5, 1, 7, 3};

        boolean isEqual = true;

        if (arrayOne.length == arrayTwo.length) {
            for (int i=0; i<arrayTwo.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("Two Arrays are Equal");
        } else {
            System.out.println("Two Arrays are Not Equal");
        }
    }
}
