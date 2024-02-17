package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        // create stream with an array of Objects
        Stream<Integer> intStream = Stream.of(new Integer[] {1, 2, 3, 4});
//        Stream<Integer> intStream2 = Stream.of(new int[] {1, 2, 3, 4}); // can't create with primitive type

        List<Integer> myList = new ArrayList<>();
        for (int i=0; i < 100; i++) myList.add(i);

        // sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        // parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        // we can use generate or iterate to create stream
        Stream<String> stream1 = Stream.generate(() -> { return "abc"; });
        Stream<String> stream2 = Stream.iterate("abc", i -> i);

        // using Arrays.stream string.chars()
        LongStream stream3 = Arrays.stream(new long[]{1, 2, 3, 4});
        IntStream chars = "abc".chars();

        // toMap
        Map<Integer, Integer> intMap = stream.collect(Collectors.toMap(i -> i, i -> i + 10));
        System.out.println(intMap);
        
        // toArray() to create array from stream
        Integer[] intArray = intStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));

        // filter
        Stream<Integer> highNumbers = myList.stream().filter(e -> e > 90);
        highNumbers.forEach(e -> System.out.print(e + " "));

        // map
        Stream<String> stringStream = Stream.of("aBc", "de", "f");
        System.out.println();
        Stream<String> upperCaseStrings = stringStream.map(e -> e.toUpperCase());
        upperCaseStrings.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // sorted natural order
        Stream<String> stringStream2 = Stream.of("aBc", "d", "ef", "12345");
        stringStream2.sorted().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // reverse order
        Stream<String> stringStream3 = Stream.of("aBc", "d", "ef", "12345");
        stringStream3.sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println();

        // flatMap
        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
        Stream<String> flatMapStream = namesOriginalList.flatMap(strList -> strList.stream());
        flatMapStream.forEach(System.out::println);

        // Map
        Stream<List<String>> namesOriginalList2 = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
//        namesOriginalList2.map(e -> e.);

        // Terminal Operation
        // Reduce
        Stream<Integer> numbers = Stream.of(5, 6, 9, 8, 5);
        Optional<Integer> intOptional = numbers.reduce((i, j) -> i * j);
        if (intOptional.isPresent())
            System.out.println("Multiplication = " + intOptional.get());

        // count
        Stream<Integer> numbers1 = Stream.of(5, 6, 9, 8, 5, 7);
        System.out.println("Number of elements in stream: " + numbers1.count());

        Stream<Integer> numbers2 = Stream.of(5, 6, 9, 8, 5, 7);
        numbers2.forEach(e -> System.out.print(e + ","));

        // anyMatch, allMatch, noneMatch
        Stream<Integer> numbers3 = Stream.of(1, 3, 4, 2, 10, 13);
        System.out.println("Stream contain 4? " + numbers3.anyMatch(i -> i==4));

        Stream<Integer> numbers4 = Stream.of(1, 3, 4, 2, 10, 13);
        System.out.println("Stream contains all elements less than 15? " + numbers4.allMatch(i -> i<15));

        Stream<Integer> numbers5 = Stream.of(1, 3, 4, 2, 10, 13);
        System.out.println("Stream doesn't contain 20? " + numbers5.noneMatch(i -> i==20));

        // findFirst
        Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if (firstNameWithD.isPresent())
            System.out.println("First Name Starting with D: " + firstNameWithD.get());

        // Tree set sorting - Descending order
        TreeSet<Integer> h =
                new TreeSet<>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" + " sorting are: " + h);

        // reverse order
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");
        ts.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Sorting will be done on the basis of the keys and not its value
        TreeMap<Integer, String> m =
                new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " + "after sorting are : " + m);

        // Tree Set Ascending order
        TreeSet<Integer> h1 =
                new TreeSet<>((o1, o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0);
        h1.add(850);
        h1.add(235);
        h1.add(1080);
        h1.add(15);
        h1.add(5);
        System.out.println("Elements of the TreeSet after" + " sorting are: " + h1);
    }
}
