package com.designpatterns.behavioraldesign.template;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Building glass windows");
    }

    // methods to be implemented by subclass
    public abstract void buildPillars();
    public abstract void buildWalls();
}
