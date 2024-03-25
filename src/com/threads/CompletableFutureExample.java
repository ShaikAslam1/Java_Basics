package com.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Void> task0 = CompletableFuture.supplyAsync(() -> 4)
                .thenApplyAsync(num -> Math.pow(num, 2))
                .thenAccept(num -> System.out.println("value: " + num))
                .thenRun(() -> System.out.println("Done"));

        System.out.println("==========wait==========");

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task 1 completed";
        });

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task 2 completed";
        });

        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task 3 completed";
        });

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(task0, task1, task2, task3);

        allTasks.thenRun(() -> {
           try {
               Void zero = task0.get();
               String one = task1.get();
               String two = task2.get();
               String three = task3.get();

               System.out.println(zero);
               System.out.println(one);
               System.out.println(two);
               System.out.println(three);
           } catch (InterruptedException | ExecutionException e) {
               throw new RuntimeException(e);
           }
        });

        try {
            allTasks.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
