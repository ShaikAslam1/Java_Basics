package com.java8;

@FunctionalInterface
interface MyFunction {
    int func(int n);
}

public class Lambda {
    private static int instanceVariable = 20;
    public static void main(String[] args) {
        int number = 10;
        MyFunction function = (n) -> {
//            number++; // not allowed
            instanceVariable++;
            System.out.println(instanceVariable);
            return number + n;
        };
        System.out.println(function.func(3));
    }
}
