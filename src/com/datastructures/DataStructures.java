package com.datastructures;

import java.util.*;

public class DataStructures {
    int a = 20; // single data
    // collection of data
    int[] arrayA = {20, 40, 50, 60, 'c'}; // array is a collection of same data type
    /*
    0000
    0001
    0010
    0011
    0100
    0101
    0110
    0111
    1000
    1010
     */

    public static void main(String[] args) {
        int[] arrayB = {20, 40, 50, 60, 'c'};
        int arrayC[] = {2,4};

        int[] arrayD = new int[3];
        arrayD[0] = 4;
        arrayD[1] = 6;
        arrayD[2] = 8;

        for(int i=0; i<arrayD.length; i++) {
            System.out.println(arrayD[i]);
        }

        System.out.println(arrayC);
        System.out.println(arrayB[4]);

        // linked list
        System.out.println("========linked list=======");
        LinkedList<String> linkedListA = new LinkedList<>();
        linkedListA.add("string 1");
        linkedListA.add("string 2");
        linkedListA.removeFirstOccurrence("ismail");

        LinkedList<String> linkedListB = new LinkedList<>();
        linkedListB.addAll(linkedListA);

        // Stack
        System.out.println("========stack=======");
        Stack<Integer> stackA = new Stack<>();
        stackA.push(3);
        stackA.push(5);

        stackA.pop();
        System.out.println(stackA);

        System.out.println("========queue=======");
        Queue<String> queueA = new PriorityQueue<>();
        queueA.add("abc");
        System.out.println(queueA);

        System.out.println("======== set =======");
        Set<String> data = new LinkedHashSet<>();

        data.add("This");
        data.add("Is");
        data.add("Set");
        data.add("Example");
        data.add("This");

        System.out.println(data);

        System.out.println("======== map =======");
        Map<String, Integer> mapA = new Hashtable<>();
        mapA.put("one", 1);
        mapA.put("two", 2);
        mapA.put("three", 3);
        mapA.put("six", 6);

        Set<String> mapKeys = mapA.keySet();
        System.out.println(mapKeys);
        System.out.println(mapA.get("six"));
    }
}
