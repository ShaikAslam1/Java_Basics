package com.ismail;

public interface Car {
    // instance variables can not define
    // all the methods in interface are implicitly public and abstract

    void breakCar();

    int numberOfGear();

    // Default Methods and Static Methods
    default void lightingSystem() {
        System.out.println("Sony Lighting System");
        musicSystem();
    }

    static void musicSystem() {
        System.out.println("Boat System");
    }

    // . .....
    //
}
