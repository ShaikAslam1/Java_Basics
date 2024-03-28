package com.fuctional;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorClass {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
        System.out.println("Multiplication: " + binaryOperator.apply(3, 2));

        Function<Integer, Integer> function = a -> a+a;
        System.out.println("binary and function: " + binaryOperator.andThen(function).apply(4, 5));

        // binary operator has minBy and maxBy methods which sort the collection
    }
}
