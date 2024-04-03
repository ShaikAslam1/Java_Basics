package com.designpatterns.structuraldesign.adapter;

public class Volt {
    /*
    One of the great real life example of Adapter design pattern is mobile charger.
    Mobile battery needs 3 volts to charge but the normal socket produces either
    120V (US) or 240V (India). So the mobile charger works as an adapter between mobile
    charging socket and the wall socket.
     */

    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
