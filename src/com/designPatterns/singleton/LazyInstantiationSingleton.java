package com.designPatterns.singleton;

public class LazyInstantiationSingleton {
    private static LazyInstantiationSingleton instance;

    private LazyInstantiationSingleton() {}

    // Lazy Instantiation, works fine in single thread
    // In multi threading this will create multiple instances
    public static LazyInstantiationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInstantiationSingleton();
        }
        return instance;
    }
}
