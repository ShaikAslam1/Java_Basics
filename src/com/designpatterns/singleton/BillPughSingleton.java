package com.designpatterns.singleton;

public class BillPughSingleton {
    // Bill pugh came up with an approach to create singleton using
    // an inner static helper class

    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    /*
    When the singleton class is loaded, SingletonHelper class is not loaded into memory
    and only when someone calls the getInstance() method, this class gets loaded and
    creates the singleton class instance. This is the most widely used approach for the
    singleton class as it does not require synchronization
     */

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /*
    Three ways singleton can be destroyed
    1. Reflections
    2. Serialization and Deserialization
    3. Cloning
     */
}
