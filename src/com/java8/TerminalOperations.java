package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        // forEach
        String[] names = {"Afrose", "Areef", "Aslam", "Javeriya", "Zaid", "Zeba", "Saba"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        Arrays.stream(names).forEach(name -> System.out.println(name));

        Optional<String> resultMin = Arrays.stream(names).min((a, b) -> a.compareTo(b));
        System.out.println(resultMin.orElseGet(() -> "Error"));
        boolean allMatch = namesList.stream().allMatch(name -> name.startsWith("A"));
        System.out.println(allMatch);

        // reduce
        int[] numbers = {1, 2, 3, 4, 5};
        int total = Arrays.stream(numbers).reduce(0, (x, y) -> x + y);
        System.out.println(total);

        namesList.stream().map(name -> name + " student").forEach(System.out::println);

        String[][] names2d = {names, names};
        String[] names1d = Stream.of(names2d).flatMap(arr -> Stream.of(arr)).toArray(size -> new String[size]);
        // System.out.println(names1d); // prints address
        for (String n: names1d) {
            System.out.println("1d arr: " + n);
        }

        // peek
        String[] names1da = Stream.of(names2d).flatMap(arr -> Stream.of(arr))
                .peek(e -> System.out.println("Peek: " + e))
                .toArray(size -> new String[size]);

        Arrays.stream(names1d).skip(1).forEach(s -> System.out.println("Skip: " + s));
        Arrays.stream(names1d).limit(1).forEach(s -> System.out.println("Limit: " + s));
        Arrays.stream(names1d).skip(3).limit(5).forEach(s -> System.out.println("Skip and Limit: " + s));

        // distinct
        long count = Arrays.stream(names1d).distinct().count();
        System.out.println("distinct values: " + count);

        // sorted
        Arrays.stream(names1d).sorted().forEach(e -> System.out.println("Sorted in ascending order: " + e));
    }
}
