package com.ismail;

public class ToyotaCar implements Car {
    @Override
    public void breakCar() {
        System.out.println("Toyota Break system");
    }

    @Override
    public int numberOfGear() {
        return 6;
    }
}
