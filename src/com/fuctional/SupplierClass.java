package com.fuctional;

import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
