package com.fuctional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args) {
        Function<String, Integer> function = s -> s.length();
        System.out.println("Length: " + function.apply("Aslam"));
        System.out.println("Length: " + function.apply("Java is a programming language"));

        System.out.println("==============================");
        double factorial = factorial(10);
        System.out.println("Factorial of 10 is: " + factorial);
        // andThen and compose methods also available in function interface
        Function<String, Integer> functionCompose = function.compose(s -> s);
        System.out.println("Functional Compose: " + functionCompose.apply("I want to learn GO Lang"));

        // BiFunction
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a+b;
        BiFunction<Integer, Integer, Integer> andThen = biFunction.andThen((a) -> a * 4);

        System.out.println(andThen.apply(4, 5));
    }

    private static double factorial(int n) {
        Function<Integer, Double> function = (x) -> (x == 0) ? 1 : x * factorial(x-1);
        return function.apply(n);
    }
}
