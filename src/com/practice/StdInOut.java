package com.practice;

import java.util.Scanner;

public class StdInOut {

    public static void main(String[] args) {
        // adding two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

       // System.out.println("Addition of two numbers: " + (a+b));//
    }

}
class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        byte c = scanner.nextByte();
        byte d = scanner.nextByte();
        System.out.println("multiplication of two numbers:" + (c*d));
    }

}
