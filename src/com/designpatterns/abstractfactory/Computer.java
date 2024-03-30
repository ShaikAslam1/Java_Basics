package com.designpatterns.abstractfactory;

public abstract class Computer {
    /*
    Abstract Factory pattern is almost similar to Factory Pattern
    except the fact that it's more like factory of factories.
     */
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
