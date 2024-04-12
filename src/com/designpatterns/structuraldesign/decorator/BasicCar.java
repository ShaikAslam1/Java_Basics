package com.designpatterns.structuraldesign.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
