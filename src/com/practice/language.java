package com.practice;

public interface language {
    void getname (String name);
}
class ProgrammingLanguage implements language{

    @Override
    public void getname(String name) {
        System.out.println("ProgrammingLanguage:" + name );
    }

}
class main {
    public static void main(String[] args) {
        ProgrammingLanguage B = new ProgrammingLanguage();
        B.getname("java");
    }
}
//multiple interfaces
interface  A {
    void head();
}
interface B{
    void hands();
}
interface C{
    void legs();
}