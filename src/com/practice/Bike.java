package com.practice;

public interface Bike {
    void engine (int cc, int pistons);
}
 class sportsbike implements Bike{
    public void engine (int cc, int pistons){
        System.out.println("the engine of sportsbike" + (cc * pistons) );

        }

     public static void main(String[] args) {
         sportsbike A = new sportsbike();
         A.engine(150,5);
     }
    }