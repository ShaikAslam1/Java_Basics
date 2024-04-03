package com.designpatterns.structuraldesign.adapter;

public class Socket {
    /*
    By default socket provide 240 volts
     */
    public Volt getVolt() {
        return new Volt(240);
    }
}
