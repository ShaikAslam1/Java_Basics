package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));

        // map
        List<Stream<String>> collect = list.stream().map(e -> e.stream().map(String::toUpperCase)).collect(Collectors.toList());

        collect.forEach(e -> e.forEach(System.out::println));

        // flatMap
        List<String> flatMap = list.stream().flatMap(e -> e.stream().map(String::toUpperCase)).collect(Collectors.toList());
        flatMap.forEach(System.out::println);
    }
}
