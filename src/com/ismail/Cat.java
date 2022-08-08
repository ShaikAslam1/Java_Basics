package com.ismail;

public class Cat extends Animal {
    // some code...

    @Override
    public void abstractClassMethod() {

    }

    @Override
    public void makeSound() {
        System.out.println("Cat sounding...");
        super.makeSound();
    }
}
