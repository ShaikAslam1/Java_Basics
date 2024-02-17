package com.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveElements {
    public static <T> List<T> removeNullUsingIterator(List<T> l, Predicate<T> p) {
        Iterator<T> iterator = l.iterator();
        while(iterator.hasNext()) {
            T t = iterator.next();

            if (!p.test(t)) {
                iterator.remove();
            }
        }
        return l;
    }

    public static <T> List<T> removeElements(List<T> l, Predicate<T> p) {
        Collection<T> collection = new ArrayList<>();
        for (T t: l) {
            if (p.test(t)) {
                collection.add(t);
            }
        }
        System.out.println("Collection to be removed: " + collection);

        l.removeAll(collection);
        return l;
    }

    public static <T> List<T> removeElementsUsingLambda(List<T> l, Predicate<T> p) {
        l = l.stream().filter(p).collect(Collectors.toList());
        return l;
    }

    public static <T> List<T> removeElementsUsingRemoveIf(List<T> l, Predicate<T> p) {
        l.removeIf(p);
        // or
//        l.removeIf(c -> p.test(c)); or l.removeIf(p::test);
        return l;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("Geeks", null, "forGeeks", null, "A computer portal"));
        System.out.println("List with null values: " + l);
        Predicate<String> isNull = item -> Objects.nonNull(item);

        l = removeNullUsingIterator(l, isNull);
        System.out.println("List without null values: " + l);

        List<String> l1 = new ArrayList<>(Arrays.asList("1", "10", "15", "10", "12", "5", "10", "20"));

        Predicate<String> is10 = item -> item == "10";

        l1 = removeElements(l1, is10);
        System.out.println("Updated List: " + l1);

        List<String> l2 = new ArrayList<>(Arrays.asList("Geeks", null, "forGeeks", null, "A computer portal"));
        Predicate<String> predicate = item -> item!=null;
        l2 = removeElementsUsingLambda(l2, predicate);
        System.out.println("List with null values removed using Lambda: " + l2);

        List<String> l3 = new ArrayList<>(Arrays.asList("Geeks", null, "forGeeks", null, "A computer portal"));
        Predicate<String> p = item -> item==null;
        l3 = removeElementsUsingRemoveIf(l3, p);
        System.out.println("List with null values removed using removeIf: " + l3);
    }
}
