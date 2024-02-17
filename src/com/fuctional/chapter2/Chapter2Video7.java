package com.fuctional.chapter2;

public class Chapter2Video7 {
    // closure
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Aslam";
            return () -> "Hello, " + name;
        };
        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
