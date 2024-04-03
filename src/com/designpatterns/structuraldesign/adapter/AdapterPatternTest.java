package com.designpatterns.structuraldesign.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        System.out.println("===========================");
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v24 = getVolt(sockAdapter, 24);
        Volt v240 = getVolt(sockAdapter, 240);
        System.out.println("v3 volts using Object Adapter= " + v3.getVolts());
        System.out.println("v24 volts using Object Adapter= " + v24.getVolts());
        System.out.println("v240 volts using Object Adapter= " + v240.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v24 = getVolt(sockAdapter, 24);
        Volt v240 = getVolt(sockAdapter, 240);
        System.out.println("v3 volts using Class Adapter= " + v3.getVolts());
        System.out.println("v24 volts using Class Adapter= " + v24.getVolts());
        System.out.println("v240 volts using Class Adapter= " + v240.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:
                return sockAdapter.get3Volts();
            case 24:
                return sockAdapter.get24Volts();
            default:
                return sockAdapter.get240Volts();
        }
    }
}
