package com.fuctional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // stream from collection
        long count = integers.stream().count();
        System.out.println("Number of integers present in the list: " + count);

        // stream from an array
        String[] str = {"a", "b", "c", "d"};
        Stream<String> stringStream = Arrays.stream(str);

        // using stream.of
        Stream<String> names = Stream.of("aslam", "areef", "afrose", "javeriya");

        // using range
        IntStream range = IntStream.range(1, 10);

        // empty stream
        Stream<Integer> emptyStream = Stream.empty();

        // read file lines
        Path path = Paths.get("C:\\Users\\asshaik\\Documents\\SAP update script.sql");
        try(Stream<String> fileLines = Files.newBufferedReader(path).lines()) {
            List<String> lineCollection = fileLines.collect(Collectors.toList());
            lineCollection.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // type of operations
        // intermediate and terminal operations

        //reduce
        Optional<Integer> maxValue = integers.stream().reduce((x, y) -> x > y ? x : y);
        Integer maxData = maxValue.orElse(0);
        System.out.println("Max value: " + maxData);

        // in parallel stream use groupByConcurrent() instead of groupBy()
        // and use forEachOrdered() instead of forEach()

        // primitive streams
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        LongStream longStream = LongStream.range(2, 9);
        DoubleStream doubleStream = DoubleStream.empty();

        double average = intStream.average().orElse(0);
        System.out.println("Average: " + average);
    }
}
