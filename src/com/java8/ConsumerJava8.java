package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerJava8 {
    public static void main(String[] args) {
        Consumer<List<Integer>> modify = list -> {
            for (int i=0; i<list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        Consumer<List<Integer>> displayList = list -> {
            list.stream().forEach(e -> System.out.print(e + " "));
        };

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);

        // using andThen
        modify.andThen(displayList).accept(list);
    }
}
