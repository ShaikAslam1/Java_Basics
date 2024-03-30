package com.designpatterns.singleton;

public enum EnumSingleton {
    // to overcome the singleton reflection issue
    // Joshua Bloch came up with enum singleton
    // This approach does not allow Lazy initialization

    INSTANCE;

    public static void doSomething(){
        // do something
    }
}
