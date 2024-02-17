package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> even = list.stream().reduce(new ArrayList<>(), (a, b) -> {
            if (b%2==0)
                a.add(b);
            return a;
        }, (a, b) -> {
                    a.addAll(b);
                    return a;
                });
        System.out.println(even);

        Optional<Integer> sum = list.stream().reduce((i, j) -> i + j);
        sum.ifPresent(e -> System.out.print(e));
    }
}
