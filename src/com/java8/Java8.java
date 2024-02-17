package com.java8;

import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;

public class Java8 {
    public static void main(String[] args) {
//        Operator<Integer> integerOperator = (Integer a, Integer b) -> a + b;
        Operator<Integer> integerOperator = Integer::sum;
        Operator<String> stringOperator = (String a, String b) -> a + b;
        Operator<Integer> multiplyOperator = (Integer a, Integer b) -> a * b;

        System.out.println(integerOperator.operate(2, 3));
        System.out.println(stringOperator.operate("Aslam ", "Shaik"));
        System.out.println(multiplyOperator.operate(4, 3));

        // Comparator
        Comparator<Integer> c = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println(c.compare(5, 2));

        integerOperator.move();

        // Date and Time API's
        Instant instant = Instant.now();

        System.out.println(instant.toString());
        System.out.println(instant.plus(Duration.ofMillis(5000)).toString());
        System.out.println(instant.minus(Duration.ofMillis(5000)).toString());
        System.out.println(instant.minusSeconds(10).toString());

        Duration duration1 = Duration.ofMillis(5000);

        Duration duration2 = Duration.ofSeconds(60);

        Duration duration3 = Duration.ofMinutes(10);

        Duration duration4 = Duration.ofHours(2);

        Duration duration5 = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);
    }
}
