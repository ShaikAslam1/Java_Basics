package com.fuctional;

@FunctionalInterface
public interface Functional {
    String toString(); // override from object
    boolean equals(Object obj); // override from object
    void doSomething() throws Exception; // abstract method
}
