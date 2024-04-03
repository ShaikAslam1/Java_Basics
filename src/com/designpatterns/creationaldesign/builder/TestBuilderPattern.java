package com.designpatterns.creationaldesign.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer build1 = new Computer
                .ComputerBuilder("500 GB", "4 GB")
                .build();
        Computer build2 = new Computer
                .ComputerBuilder("1 TB", "32 GB")
                .setBluetoothEnabled(true)
                .setGraphicCardEnabled(true)
                .build();
        Computer build3 = new Computer
                .ComputerBuilder("5 TB", "64 GB")
                .setGraphicCardEnabled(true)
                .build();

        System.out.println(build1);
        System.out.println(build2);
        System.out.println(build3);
    }
}
