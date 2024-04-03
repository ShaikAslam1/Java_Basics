package com.designpatterns.structuraldesign.adapter;

public interface SocketAdapter {
    /*
    Adapter design pattern is one of the structural design pattern and its used so
    that two unrelated interfaces can work together. The object that joins these
    unrelated interface is called an Adapter.
     */

    /*
    Now we want to build an adapter that can produce 3 volts, 12 volts and default
    240 volts. So first of all we will create an adapter interface with these methods.
     */

    Volt get240Volts();
    Volt get24Volts();
    Volt get3Volts();
}
