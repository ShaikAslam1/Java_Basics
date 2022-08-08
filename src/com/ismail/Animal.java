package com.ismail;

public abstract class Animal {

    private String bread;
    private String color;

    public abstract void abstractClassMethod();

    public void makeSound() {
        System.out.println("Barking...");
    }

    public static void main(String[] args) {
//        Animal animal = new Animal();
//
//        animal.makeSound();
//        animal.color = "Red";
//        Animal.test();
//        animal.test();

        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        Cat cat2 = new Cat();
        cat2.makeSound();

    }

    static void test() {
        System.out.println("test");
    }

}
