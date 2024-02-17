package com.fuctional.chapter2;

import java.util.function.Function;

public class Chapter2Video6 {
    // returning function
    protected static class MyMath {
        public static Integer timesTwo(Integer x) {
            return x * 2;
        }
        public static Integer timesThree(Integer x) {
            return x * 3;
        }
        public static Integer timesFour(Integer x) {
            return x * 4;
        }

        public static Function<Integer, Integer> createMultiply(Integer y) {
            return (Integer x) -> x * y;
        }
    }

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Hello Function";
        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());

        Function<Integer, Integer> timesTwo = MyMath.createMultiply(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiply(3);
        Function<Integer, Integer> timesFour = MyMath.createMultiply(4);

        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));
        System.out.println(timesFour.apply(6));
    }
}
