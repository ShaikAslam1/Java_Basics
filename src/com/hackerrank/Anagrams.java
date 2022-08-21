package com.hackerrank;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a.length() != b.length()) {
            return false;
        }

        java.util.List<String> aChar = new java.util.ArrayList<>();
        java.util.List<String> bChar = new java.util.ArrayList<>();

        for(int i=0; i<a.length(); i++) {
            aChar.add(String.valueOf(a.charAt(i)));
        }
        for(int i=0; i<b.length(); i++) {
            bChar.add(String.valueOf(b.charAt(i)));
        }

        java.util.Map<String, Integer> aMap = new java.util.HashMap<>();
        java.util.Map<String, Integer> bMap = new java.util.HashMap<>();

        for(String c: aChar) {
            if (aMap.containsKey(c)) {
                aMap.put(c, aMap.get(c)+1);
            } else {
                aMap.put(c, 1);
            }
        }

        for(String c: bChar) {
            if (bMap.containsKey(c)) {
                bMap.put(c, bMap.get(c)+1);
            } else {
                bMap.put(c, 1);
            }
        }

        int count = 0;

        for(String aKey: aMap.keySet()) {
            for(String bKey: bMap.keySet()) {
                if(aKey.equalsIgnoreCase(bKey)) {
                    ++count;
                    if(!java.util.Objects.equals(aMap.get(aKey), bMap.get(bKey))) {
                        return false;
                    }
                }
            }
        }
        return count != 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

