package com.designpatterns.creationaldesign.singleton;

public class EagerInitializedSingleton {
    /*
    1. one instance of the class exists in the Java Virtual Machine
    2. class must provide a global access point to get the instance
    3. used for logging, drivers objects, caching, and thread pool
    4. also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.
    5. example, java.lang.Runtime, java.awt.Desktop
     */

    /*
    Implementation:
    1. Private constructor
    2. Private static variable of the same class
    3. Public static method that returns the instance
     */

    // Eager Initialization
    private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}
