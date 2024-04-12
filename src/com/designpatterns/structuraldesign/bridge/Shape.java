package com.designpatterns.structuraldesign.bridge;

public abstract class Shape {
    // composition - implementer
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
