package com.fuctional.chapter2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter2Video8 {
    // Higher order functions
    public static void main(String[] args) {
//        BiFunction<Float, Float, Float> divide = (x, y) -> x/y;
//        BiFunction<Float, Float, Float> divide = (x, y) -> {
//            if (y == 0f) {
//                System.out.println("exception");
//                return 0f;
//            }
//            return x / y;
//        };
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsNotZeroCheck =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: second argument is zero");
                        return 0f;
                    }
                    return func.apply(x, y);
                };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsNotZeroCheck.apply(divide);
        System.out.println(divideSafe.apply(10f, 0f));
    }
}
