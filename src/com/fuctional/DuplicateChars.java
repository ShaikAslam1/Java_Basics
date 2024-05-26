package com.fuctional;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        duplicateCharCount("Java2EE");
        System.out.println();
        duplicateCharCount("Fresh Fish");
    }

    static void duplicateCharCount(String inputString) {
        Map<Character, Integer> map = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for (char c: strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        Set<Character> keySet = map.keySet();
        for (Character ch: keySet) {
            if (map.get(ch) > 1) {
                System.out.println(ch + ": " + map.get(ch));
            }
        }
    }
}
