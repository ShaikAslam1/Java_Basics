package com.fuctional;

import java.util.function.UnaryOperator;

public class UnaryOperatorClass {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = s -> s*10;
        System.out.println(unaryOperator.apply(2));
        UnaryOperator<String> stringUnaryOperator = UnaryOperator.identity();
        System.out.println(stringUnaryOperator.apply("aslam"));
    }
}
