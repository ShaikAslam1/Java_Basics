package com.fuctional;

public class FunctionalClass {
    public static void main(String[] args) {
        Functional functional = lambdaWrapper(() -> {});
        try {
            functional.doSomething();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static Functional lambdaWrapper(Functional functional) {
        return () -> {
            System.out.println("do something method");
//            throw new RuntimeException("this is a run time exception");
            throw new Exception("This is compile time exception");
        };
    }
}
