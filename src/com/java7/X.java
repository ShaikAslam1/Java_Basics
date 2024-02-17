package com.java7;

public class X {
    String  str = "default";
    X(String s) {
        str = s;
    }
    void print() {
        System.out.println(str);
    }
    public static void main(String[] args) {
        new X("hello").print();
        int i = 0;
        i++;
        System.out.println(i++);
        System.out.println(i);
    }
}
