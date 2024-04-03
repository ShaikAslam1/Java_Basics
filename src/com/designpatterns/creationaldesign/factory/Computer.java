package com.designpatterns.creationaldesign.factory;

public abstract class Computer {
    /*
    The factory design pattern is used when we have a superclass with multiple
    subclasses and based on input, we need to return one of the subclass
     */

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD= " + this.getHDD() + ", CPU= " + this.getCPU();
    }
}
