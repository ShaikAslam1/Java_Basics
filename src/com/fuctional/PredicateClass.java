package com.fuctional;

import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
        Predicate<Integer> intPredicate = x -> x > 10;
        System.out.println("test: " + intPredicate.test(10));
        System.out.println("negate: " + intPredicate.negate().test(5));
        System.out.println("and: " + intPredicate.and(x -> x == 20).test(20));
        System.out.println("or: " + intPredicate.or(x -> x < 10).test(9));
    }
}
