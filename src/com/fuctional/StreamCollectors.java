package com.fuctional;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aslam", "IT", 30000));
        employeeList.add(new Employee("Suleiman", "IT", 40000));
        employeeList.add(new Employee("Areef", "Education", 60000));
        employeeList.add(new Employee("Idris", "Education", 50000));
        employeeList.add(new Employee("Afrose", "History", 72000));
        employeeList.add(new Employee("Musa", "History", 82000));
        employeeList.add(new Employee("Javeriya", "IslamicStudies", 55000));
        employeeList.add(new Employee("Ibrahim", "IslamicStudies", 65000));

        // group by departments and count the number of employees in each department
        System.out.println("group by departments and count the number of employees in each department");
        Map<String, Long> employeesAcrossDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        employeesAcrossDept.entrySet().forEach(System.out::println);

        System.out.println();
        // group by department and get maximum salary
        System.out.println("group by department and get maximum salary");
        Map<String, Optional<Employee>> groupByDeptMaxSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
//        groupByDeptMaxSalary.entrySet().forEach(emp -> System.out.println("Department: " + emp.getKey()
//                + ", name: " + emp.getValue().get().getName() + ", salary: " + emp.getValue().get().getSalary()));
        groupByDeptMaxSalary.forEach((key, value) -> System.out.println("Department: " + key
                + ", name: " + value.orElse(new Employee()).getName() + ", salary: " + value.orElse(new Employee()).getSalary()));

        System.out.println();
        // group by department and get the result in a new TreeMap
        System.out.println("group by department and get the result in a new TreeMap");
        TreeMap<String, Set<String>> groupByDepartmentTreeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                TreeMap::new, Collectors.mapping(Employee::getName, Collectors.toSet())));
        groupByDepartmentTreeMap.forEach((key, value) -> {
            System.out.println("Department: " + key);
            System.out.println("Employee Names");
            value.forEach(System.out::println);
        });

        System.out.println();
        // in parallelStream we have to use groupByConcurrent() method instead of groupingBy()

        // Partition by with downstream
        System.out.println("Partition by with downstream");
        Map<Boolean, Long> partitionBySalary = employeeList.stream().collect(Collectors.partitioningBy
                (employee -> employee.getSalary() > 30000, Collectors.counting()));
        partitionBySalary.forEach((key, value) -> {
            System.out.println("key :" + key + ", value:" + value);
        });

        System.out.println();
        // averagingInt
        System.out.println("Averaging Int");
        List<Integer> intNumbers = Arrays.asList(6, 7, 3, 8, 1);
        Double averageInt = intNumbers.stream().collect(Collectors.averagingInt(num -> num));
        System.out.println("Average int: " + averageInt);

        System.out.println();
        // averaging long
        System.out.println("Averaging Long");
        List<Long> longNumbers = Arrays.asList(22L, 17L, 3L, 38L, 11L);
        Double averagingLong = longNumbers.stream().collect(Collectors.averagingLong(Long::longValue));
        System.out.println("Averaging Long: " + averagingLong);

        System.out.println();
        // averaging double
        System.out.println("averaging double");
        List<Double> doubleNumbers = Arrays.asList(22.6, 17.4, 3.0, 57.7, 11.89);
        Double averagingDouble = doubleNumbers.stream().collect(Collectors.averagingDouble(num -> num));
        System.out.println("averaging double: " + averagingDouble);

        System.out.println();
        // summing double
        System.out.println("Summing Double");
//        Double summingDouble = doubleNumbers.stream().collect(Collectors.summingDouble(Double::doubleValue));
        double summingDouble = doubleNumbers.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("summing double: " + summingDouble);

        // in summarizing we have three variants summarizingInt, summarizingLong, and summarizingDouble

        System.out.println();
        // collectingAndThen
        System.out.println("collectingAndThen");
        List<Employee> unmodifiableList = employeeList.stream().collect(Collectors
                .collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        // unmodifiableList.add(new Employee()); // unsupportedOperationException will be thrown
        unmodifiableList.forEach(System.out::println);

        System.out.println();
        System.out.println("collecting and then");
        String collectAndThen = employeeList.stream().collect(Collectors.collectingAndThen(Collectors
                .averagingInt(Employee::getSalary), (avg) -> avg > 20000 ? "pass" : "fail"));
        System.out.println("pass or fail: " + collectAndThen);

        // to Array
        System.out.println();
        System.out.println("To Array");
        Integer[] intArray = intNumbers.stream().toArray(Integer[]::new);

        Employee[] empArray = employeeList.stream().filter(employee -> employee.getDepartment().equals("IT"))
                .toArray(Employee[]::new);

        LinkedList<Employee> employeeLinkedList = employeeList.stream().collect(Collectors.toCollection(LinkedList::new));

        // map ->> mapToInt, mapToLong, mapToDouble and mapToObject

        // flatMap
        List<List<String>> alphabetList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
        List<String> upperCase = alphabetList.stream().flatMap(a -> a.stream()).map(String::toUpperCase)
                .collect(Collectors.toList());
        upperCase.forEach(System.out::println);

        // flatMapToInt, flatMapToLong and flatMapToDouble

        System.out.println();
        // random number generator
        System.out.println("Random number generator");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
