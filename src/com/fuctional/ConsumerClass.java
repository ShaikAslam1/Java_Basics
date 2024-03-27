package com.fuctional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Original String: " + s);
        Consumer<String> andThen = consumer.andThen(s -> System.out.println("upper case: " + s.toUpperCase()));

        List<String> names = Arrays.asList("aslam", "areef", "afrose", "javeriya");
        for (String name: names) {
            andThen.accept(name);
        }
        System.out.println("=====================================");
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println("key: "+s1 + " value: " + s2);
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }
}
