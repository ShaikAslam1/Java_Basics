package com.fuctional.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter3Video4 {
    public static void main(String[] args) {
        String[] wordsArray = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        String longWords = words.stream()
                .filter((x) -> x.length() > 5)
                .collect(Collectors.joining(","));
        System.out.println(longWords);

        Long howManyLongWords = words.stream()
                .filter((x) -> x.length() > 5)
                .collect(Collectors.counting());

        System.out.println(howManyLongWords);

        Map<Object, List<String>> wordLengthMap = words.stream()
                .collect(Collectors.groupingBy((word) -> word.length()));

        System.out.println(wordLengthMap);

        Map<Boolean, List<String>> wordLengthPartition = words.stream()
                .collect(Collectors.partitioningBy((word) -> word.length() > 5));
        System.out.println(wordLengthPartition);
    }
}
