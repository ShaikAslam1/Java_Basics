package com.designpatterns.behavioraldesign.template;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildPillars() {
        System.out.println("Building pillars with glass coating");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building glass walls");
    }
}
