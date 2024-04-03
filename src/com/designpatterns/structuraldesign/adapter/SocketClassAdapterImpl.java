package com.designpatterns.structuraldesign.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    /*
    using two ways we can achieve adapter design
    1. Class Adapter:- this uses inheritance and extends the source interface.
    2. Object Adapter:- this uses composition and adapter contains the source object.

    This is the first way
     */
    @Override
    public Volt get240Volts() {
        return getVolt();
    }

    @Override
    public Volt get24Volts() {
        return convertVolt(getVolt(), 10);
    }

    @Override
    public Volt get3Volts() {
        return convertVolt(getVolt(), 80);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
