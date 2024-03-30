package com.handsonjava8;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;

public class Concurrent {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<Integer, BigInteger> result = Answer2.findAnswer(numbers);
        System.out.println(result);
    }
}

// Write your answer here, and then test your code.
// Your job is to implement the findAnswer() method and the FactorialTask class.

class Answer2 {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static Map<Integer, BigInteger> findAnswer(List<Integer> numbers) {
        // Your code goes here.
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<Map.Entry<Integer, BigInteger>>> futures = new ArrayList<>();

        for (Integer number: numbers) {
            futures.add(executor.submit(new FactorialTask(number)));
        }

        Map<Integer, BigInteger> results = new HashMap<>();
        for (Future<Map.Entry<Integer, BigInteger>> future: futures) {
            try {
                Map.Entry<Integer, BigInteger> result = future.get();
                results.put(result.getKey(), result.getValue());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        return results;
    }
}

class FactorialTask implements Callable<Map.Entry<Integer, BigInteger>> {

    // Some of your code goes here
    private final Integer number;

    public FactorialTask(Integer number) {
        this.number = number;
    }

    @Override
    public Map.Entry<Integer, BigInteger> call() throws Exception {
        // Your code goes here.
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return new AbstractMap.SimpleEntry<>(number, factorial);
    }
}
