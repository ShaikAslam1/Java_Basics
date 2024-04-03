package com.designpatterns.structuraldesign.composite;

public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing circle with color: " + fillColor);
    }
}
