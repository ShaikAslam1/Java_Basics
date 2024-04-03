package com.designpatterns.creationaldesign.factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server", "16 GB", "1 TB", "2.9 GHz");
        System.out.println("PC config: " + pc.toString());
        System.out.println("Server config: " + server.toString());
    }
    /*
    Advantages:
    1. Factory design pattern provides approach to code for interface rather than implementation.
    2. removes the instantiation of actual implementation classes from client code.
    3. provides abstraction between implementation and client classes through inheritance.
     */

    /*
    JDK Uses:
    1. Calendar, ResourceBundle and NumberFormat getInstance() methods.
    2. valueOf() method in wrapper classes like Boolean, Integer etc.
     */
}
