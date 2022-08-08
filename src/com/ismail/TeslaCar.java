package com.ismail;

public class TeslaCar implements Car, Car2 {

    @Override
    public void breakCar() {
        System.out.println("Break tesla car");
    }

    @Override
    public int numberOfGear() {
        return 4;
    }

    @Override
    public void carBrand() {
        System.out.println("Tesla");
    }

    @Override
    public void tyreBrand() {
        System.out.println("MRF");
    }
}
