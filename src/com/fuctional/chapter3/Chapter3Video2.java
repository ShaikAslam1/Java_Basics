package com.fuctional.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Video2 {
    // Filter
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5,6,7,8,9,10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        Predicate<Integer> isEven = (x) -> x%2==0;

        List<Integer> evens = listOfIntegers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println(evens);

        String[] wordsArray = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        Predicate<String> isLongThan5 = (str) -> str.length() > 5;

        List<String> longWords = words.stream()
                .filter(isLongThan5)
                .collect(Collectors.toList());
        System.out.println(longWords);

        // dynamic Predicate
        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        };

        Predicate<String> isLongerThan3 = createLengthTest.apply(3);
        List<String> shortWords = words.stream()
                .filter(isLongerThan3)
                .collect(Collectors.toList());
        System.out.println(shortWords);
    }
}
