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
    /*
    Advantages:
    1. provides approach to code for interface rather than implementation.
    2. “factory of factories” and can be easily extended to accommodate more products.
    3. robust and avoid conditional logic of Factory pattern.
     */

    /*
    JDK uses:
    javax.xml.parsers.DocumentBuilderFactory#newInstance()
    javax.xml.transform.TransformerFactory#newInstance()
    javax.xml.xpath.XPathFactory#newInstance()
     */
}
