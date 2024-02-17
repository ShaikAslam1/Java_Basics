package com.fuctional.chapter2;

import java.util.function.BiFunction;

public class Chapter2Video3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x,y) -> x+y;
        System.out.println(add.apply(32,322));

        TriFunction<Integer, Integer, Integer, Integer> addThree = (x,y,z) -> x+y+z;
        System.out.println(addThree.apply(54, 3, 4));

        NoArgFunction<String> hello = () -> "Hello!";
        System.out.println(hello.apply());
    }
}
