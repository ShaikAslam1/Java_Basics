package com.datastructures;

public class TowerHanoiRecursion {


    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {

        // base case n == 1 print
        // rec n-1 a -> b using c
        // nth a -> c
        // rec n-1 b -> c using a

        if (disks == 1) {
            System.out.println("move 1st disk from "+source+" to "+destination);
            return;
        }

        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println("move "+disks+"th disk from " + source+ " to " + destination);
        towerOfHanoi(disks-1, auxiliary, source, destination);

    }


    public static void main(String[] args) {
        towerOfHanoi(3, 'a', 'b', 'c');
    }
}
