package com.designpatterns.singleton;

import java.io.Serializable;

public class ThreadSafeSingleton implements Cloneable, Serializable {
    // Thread safe singleton
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // to prevent object creation using reflections
        if (instance != null) {
            throw new InstantiationError("Object creation is not allowed");
        }
    }

//    public static synchronized ThreadSafeSingleton getInstance() {
//        if (instance == null) {
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }

    // double-checked locking principle
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    // to overcome serialization and deserialization singleton issue
    // implement readResolve() then return instance
    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
