package com.practice;

public interface line {
    void road();
}
interface highway extends line{
    void flatroads();

    @Override
    void road();
}
class speed implements line,highway{

    @Override
    public void flatroads() {
        System.out.println("full speed");

    }

    @Override
    public void road() {
        System.out.println("4 roads");

    }

        public static void main(String[] args) {
            speed A = new speed();
            A.flatroads();
            A.road();
}

    }
    interface D{
    void d();
    }
interface E{
    void e();
}
interface F extends D,E{
    void f();
}
class G implements F{

    @Override
    public void d() {
        System.out.println("dhoni");
    }

    @Override
    public void e() {
        System.out.println("virat");
    }

    @Override
    public void f() {
        System.out.println("rohit");
    }

    public static void main(String[] args) {
        G z = new G();
        z.d();
        z.e();
        z.f();
    }
}









