package com.designpatterns.structuraldesign.decorator;

public class DecoratorPatternTest {
    /*
    Decorator design pattern is used to modify the functionality of an object at runtime.
    At the same time other instances of the same class will not be affected by this, so
    individual object gets the modified behavior.
     */
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*******");

        Car luxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        luxuryCar.assemble();

        /*
        1. Decorator design pattern is helpful in providing runtime modification abilities and
        hence more flexible. It's easy to maintain and extend when the number of choices are more.
        2. The disadvantage of decorator design pattern is that it uses a lot of similar kind
        of objects (decorators).
        3. Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
         */
    }
}
