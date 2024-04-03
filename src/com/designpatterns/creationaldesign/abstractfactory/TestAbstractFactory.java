package com.designpatterns.creationaldesign.abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","3.9 GHz"));
        System.out.println("Abstract factory PC config: " + pc.toString());
        System.out.println("Abstract factory Server config: " + server.toString());
    }
}
