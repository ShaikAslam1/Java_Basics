package com.hackerrank;

public class Exam {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x + " " + t.y);

        int x=3, y=5, z=10;

        float ans = 35/0;
        System.out.println(ans);
    }
}

class Test {
    protected int x,y;
}