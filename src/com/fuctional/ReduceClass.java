package com.fuctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceClass {
    public static void main(String[] args) {
        // terminal operations like min, max, average, sum are reduction operations
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long numberOfElements = myList.stream().count();
        System.out.println("number of elements in myList: " + numberOfElements);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aslam", "IT", 30000));
        employeeList.add(new Employee("Areef", "Education", 60000));
        employeeList.add(new Employee("Afrose", "History", 72000));
        employeeList.add(new Employee("Javeriya", "IslamicStudies", 55000));

        Optional<Integer> salary = employeeList.stream().map(Employee::getSalary).reduce((x, y) -> x + y);
        Integer totalSalary = salary.orElse(0);
        System.out.println("Total Family Salary: " + totalSalary);

        // skip(long n)
        /*
        1. If you pass n as negative then IllegalArgumentException is thrown.
        2. skip (n) if n is greater than the elements contained in the Stream then an empty stream will be returned.
        3. skip (n) first n elements in the encounter order will be skipped.
        4. if n is fairly larger number then this is expensive operation in parallel stream
         */
        System.out.println("=========SKIP=========");
        List<Employee> skipEmployeeList = employeeList.stream().skip(2).collect(Collectors.toList());
        skipEmployeeList.forEach(System.out::println);

        // limit()
        System.out.println("=========LIMIT=========");
        List<Employee> limitEmployeeList = employeeList.stream().limit(2).collect(Collectors.toList());
        limitEmployeeList.forEach(System.out::println);

        // filter()
        System.out.println("=========FILTER=========");
        List<Employee> historyEmployees = employeeList.stream()
                .filter(emp -> emp.getDepartment().equals("History"))
                .collect(Collectors.toList());
        historyEmployees.forEach(System.out::println);

        // findFirst()
        System.out.println("=========Find First=========");
        Employee firstEmployee = employeeList.stream().findFirst()
                .orElse(new Employee("Dummy", "Dummy", 0));
        System.out.println(firstEmployee);

        // findAny()
        System.out.println("=========Find Any=========");
        Employee anyEmployee = employeeList.stream().findAny()
                .orElse(new Employee("Dummy", "Dummy", 0));
        System.out.println(anyEmployee);
    }
}
