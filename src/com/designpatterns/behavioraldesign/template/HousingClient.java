package com.designpatterns.behavioraldesign.template;

public class HousingClient {
    /*
    1. Template Method design pattern is used to create a method stub and deferring
    some of the steps of implementation to the subclasses.

    2. Template method defines the steps to execute an algorithm, and it can provide
    default implementation that might be common for all or some of the subclasses.
    e.g: of build a house
     */
    public static void main(String[] args) {
        HouseTemplate house = new WoodenHouse();

        // using template method
        house.buildHouse();
        System.out.println("**************");

        house = new GlassHouse();
        house.buildHouse();

        /*
        1. All non-abstract methods of java.io.InputStream, java.io.OutputStream,
        java.io.Reader and java.io.Writer.
        2. All non-abstract methods of java.util.AbstractList, java.util.AbstractSet
        and java.util.AbstractMap.
         */
    }
}
