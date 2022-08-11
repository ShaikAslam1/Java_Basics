package com.practice;

public interface mobile {
    //mobile is an interface//
    //it includes abstract methods speaker(), display()//
    public void playing();
    public void calling();
    public void texting();

    default void locking() {
        System.out.println("new update");
    }
public  interface audio extends mobile{
         void fullsound();
    @Override
    void calling();
    @Override
    void playing();
    @Override
    void texting();
    @Override
    default void locking() {
        mobile.super.locking();
    }
}
}


class samsung implements mobile.audio {


    public void playing() {
        System.out.println("graphic card");
    }

    public  void fullsound(){
        System.out.println("f5");
    }
    public void calling() {
        System.out.println("fast calling");
    }
    public void texting() {
        System.out.println("slow texting");
    }
    public static void main(String[] args) {
        samsung A = new samsung();
        A.calling();
        A.playing();
        A.texting();
        A.locking();
        A.fullsound();

    }
}
