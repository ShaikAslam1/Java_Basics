package com.java7;

class X1 {
    X1(){}
    protected void one(){} // private will not work protected is
}
public class AccessModifiers extends X1 {
    AccessModifiers(){}
    private void two(){one();}
    public static void main(String[] args) {
        new AccessModifiers().two();
    }
}
