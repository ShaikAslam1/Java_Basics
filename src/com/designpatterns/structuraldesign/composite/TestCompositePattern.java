package com.designpatterns.structuraldesign.composite;

public class TestCompositePattern {
    /*
    1. Composite pattern should be applied only when the group of
    objects should behave as the single object.
    2. Composite design pattern can be used to create a tree like structure.
     */
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
