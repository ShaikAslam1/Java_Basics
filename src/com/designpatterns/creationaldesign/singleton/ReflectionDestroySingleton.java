package com.designpatterns.creationaldesign.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDestroySingleton {
    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = null;
        ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
        Constructor[] constructors = ThreadSafeSingleton.class.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            constructor.setAccessible(true);
            try {
                threadSafeSingleton = (ThreadSafeSingleton) constructor.newInstance();
                break;
            } catch (InvocationTargetException | InstantiationException
                     | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Hash code of t1: " + t2.hashCode());
        System.out.println("Hash code of t1: " + threadSafeSingleton.hashCode());
    }
}
