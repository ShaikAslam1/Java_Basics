package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class ListItems {
    private int key;
    private String value;

    public int getKey() {
        return key;
    }

    public ListItems(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListItems{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}

public class ListToMap {
    public static void main(String[] args) {
        List<ListItems> list = new ArrayList<>();
        list.add(new ListItems(1, "I"));
        list.add(new ListItems(2, "Love"));
        list.add(new ListItems(3, "Geeks"));
        list.add(new ListItems(4, "For"));
        list.add(new ListItems(5, "Geeks"));

        System.out.println("List: " + list);

        Map<Integer, String> map = new HashMap<>();
        list.forEach(e -> {
            map.put(e.getKey(), e.getValue());
        });
        System.out.println("Map: " + map);

        System.out.println("============================");

        // creating arraylist to add elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Apple");

        // printing contents of arraylist before conversion
        System.out.println("Elements in ArrayList are : " + fruits);

        // creating new hashmap and using method reference
        // with necessary classes for the conversion
        HashMap<String, Integer> res = fruits.stream().collect(Collectors.toMap(
                Function.identity(), String::length,
                (e1, e2) -> e1, HashMap::new));

        // printing the elements of the hashmap
        System.out.println("Elements in HashMap are : " + res);
    }
}
