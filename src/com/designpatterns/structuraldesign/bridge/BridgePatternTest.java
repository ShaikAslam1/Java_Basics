package com.designpatterns.structuraldesign.bridge;

public class BridgePatternTest {
    /*
    bridge design pattern is used to decouple the interfaces from implementation
    and hiding the implementation details from the client programs.
     */
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();

        // using lambdas
        Shape triangle2 = new Triangle(() -> System.out.println(": yellow."));
        triangle2.applyColor();

        /*
        Bridge design pattern can be used when both abstraction and implementation can have different
        hierarchies independently, and we want to hide the implementation from the client application.
         */
    }
}
