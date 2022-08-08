package com.ismail;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car teslaCar = new TeslaCar();
        teslaCar.breakCar();
        System.out.println(teslaCar.numberOfGear());
        teslaCar.lightingSystem();
        Car.musicSystem();


        Car toyotaCar = new ToyotaCar();
        toyotaCar.breakCar();
        System.out.println(toyotaCar.numberOfGear());
        toyotaCar.lightingSystem();

        MountainBike mountainBike = new MountainBike();
        mountainBike.setGear(5);

        MountainBike mountainBike2 =
                new MountainBike(20, 12, 60, 3);

        mountainBike.speed = 4;

        toyotaCar.equals(teslaCar);
    }
}
