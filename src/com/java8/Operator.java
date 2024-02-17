package com.java8;

@FunctionalInterface
public interface Operator<T> {
    T operate(T a, T b);
    default void move() {
        System.out.println("Moving");
    }
}
