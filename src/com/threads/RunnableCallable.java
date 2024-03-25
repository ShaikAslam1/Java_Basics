package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableCallable {
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("Inside runnable");

        Callable<String> call = (Callable) () -> "Inside Callable";

        run.run();
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(1);
            Future<String> future = executorService.submit(call);
            System.out.println(future.get());
            executorService.shutdown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
