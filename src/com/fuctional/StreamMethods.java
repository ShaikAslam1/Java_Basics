package com.fuctional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        // max(comparator)
        List<Integer> numberList = Arrays.asList(11, 1, 9, 4, 98, 0, 17, 8, 2, 3, 1, 9, 4);
        Integer maxValue = numberList.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max value: " + maxValue);

        System.out.println("Maximum value: " + numberList.stream().max((x, y) -> x.compareTo(y)).orElse(0));

        System.out.println("Max... value...: " + numberList.stream().max((x, y) -> {
            if (x < y)
                return -1;
            else if (x > y)
                return 1;
            else
                return 0;
        }).orElse(0));

        // min(comparator)
        Integer minValue = numberList.stream().min(Integer::compareTo).orElse(-1);
        System.out.println("Min value: " + minValue);

        Integer minimumValue = numberList.stream().min((x, y) -> {
            if (x < y)
                return -1;
            else if (x > y)
                return 1;
            else
                return 0;
        }).orElse(-2);
        System.out.println("Minimum value: " + minimumValue);

        // Comparator.comparing
        List<Employee> empList = Arrays.asList(new Employee("Ram", "IT", 12000),
                new Employee("Tina", "HR", 15000),
                new Employee("Roger", "IT", 9000),
                new Employee("Roger", "IT", 9000),
                new Employee("Troy", "Accounts", 7000));

        Employee maxSalaryEmployee = empList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(new Employee());
        System.out.println("Max Salary Employee: " + maxSalaryEmployee);

        Employee minSalaryEmployee = empList.stream().min(Comparator.comparing(Employee::getSalary)).orElse(new Employee());
        System.out.println("Min Salary Employee: " + minSalaryEmployee);

        // distinct()
        numberList.stream().distinct().forEach(e -> System.out.print(e + ", "));
        System.out.println();
        // distinct employee
        System.out.println("====Distinct Employees====");
        empList.stream().distinct().forEach(System.out::println);

        // sort()
        System.out.println("===========Sort============");
        List<Integer> myList = Arrays.asList(11, 1, 9, 1, 4, 11, 17);
        List<Integer> sortedMyList = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedMyList);

        System.out.println("Reverse Sort:");
        List<Integer> reverseSortMyList = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortMyList);

        System.out.println("Sort names:");
        List<String> myNames = Arrays.asList("Ram", "Madan", "Jack", "Ram", "Jack");
        List<String> sortedMyNames = myNames.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedMyNames);

        System.out.println("Sort the employees");
        List<Employee> sortedEmployeeList = empList.stream().sorted().collect(Collectors.toList());
        sortedEmployeeList.forEach(System.out::println);

        System.out.println("Sort employees by department");
        List<Employee> sortByDept = empList.stream().sorted((emp1, emp2) -> emp1.getDepartment().compareTo(emp2.getDepartment()))
                .collect(Collectors.toList());
        sortByDept.forEach(System.out::println);

        System.out.println("Sort by salary");
        List<Employee> sortBySalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        sortBySalary.forEach(System.out::println);

        System.out.println();
        System.out.println("Sort a Map");

        Map<Integer, String> nameMap = new HashMap<>();
        nameMap.put(1, "Ram");
        nameMap.put(2, "Peter");
        nameMap.put(3, "Ajay");
        nameMap.put(4, "Priscilla");
        nameMap.put(5, "Dan");

        LinkedHashMap<Integer, String> sortedMapByValue = nameMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (k, v) -> k, LinkedHashMap<Integer, String>::new));
        sortedMapByValue.entrySet().forEach(System.out::println);

        System.out.println();
        // Comparator:: compare with multiple fields
        System.out.println("Comparator:: compare with multiple fields");
        Comparator<Employee> compareByName = Comparator.comparing(Employee::getName);
        Comparator<Employee> compareByDepartment = Comparator.comparing(Employee::getDepartment);
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);

        List<Employee> sortByNameDept = empList.stream().sorted(compareByName.thenComparing(compareByDepartment)
                        .thenComparing(compareBySalary)).collect(Collectors.toList());
        sortByNameDept.forEach(System.out::println);

        System.out.println();
        /*
        peek() mainly for debugging, when we want to see
        the elements flow from one operation to another
         */
        System.out.println("Peek example");
        empList.stream().filter(employee -> employee.getSalary() > 1000)
                .peek(System.out::println)
                .filter(employee -> employee.getDepartment().equals("IT"))
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println();
        /*
        concat() -> if you want to combine two stream use concat method
         */
        System.out.println("Concat");
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream<Integer> stream3 = Stream.of(7, 8, 9);
        Stream<Integer> stream4 = Stream.of(10, 11, 12);
        Stream<Integer> concatedStream = Stream.concat(stream1, Stream.concat(stream2, Stream.concat(stream3, stream4)));
//        concatedStream.forEach(num -> System.out.print(num + ", "));

        /*
         boxed() in IntStream used to get a Stream consisting of the elements of this stream.
         */
        Stream<Integer> intStream = IntStream.of(1, 2, 3, 4, 5, 6).boxed();

        System.out.println();
        // anyMatch()
        System.out.println("AnyMatch");
        boolean empAvailable = empList.stream().anyMatch(employee -> employee.getName().equals("Aslam"));
        System.out.println("Is employee aslam available: " + empAvailable);

        System.out.println();
        // allMatch()
        System.out.println("All Match");
        boolean salaryGreaterThan = empList.stream().allMatch(employee -> employee.getSalary()>20000);
        System.out.println("Is all employees get salary more than 20000: " + salaryGreaterThan);

        System.out.println();
        // noneMatch()
        System.out.println("None Match");
        boolean salaryNoMoreThan50K = empList.stream().noneMatch(employee -> employee.getSalary() > 50000);
        System.out.println("Is any employee not having salary more than 50K: " + salaryNoMoreThan50K);

        System.out.println();
        // collect method examples
        // joining
        String collectIntegers = concatedStream.map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(collectIntegers);

        System.out.println();
        // toCollection
        System.out.println("toCollection method");
        TreeSet<Employee> employeeNames = empList.stream().collect(Collectors.toCollection(TreeSet::new));
        employeeNames.forEach(System.out::println);

        System.out.println();
        // toMap
        System.out.println("toMap method");
        Map<String, Integer> empNameSalary = empList.stream().distinct().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        empNameSalary.entrySet().forEach(System.out::println);

        System.out.println();
        // summingInt
        System.out.println("summingInt");
        Integer totalSalary = empList.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println("total salary: " + totalSalary);

        System.out.println();
        // groupingBy
        System.out.println("groupingBy");
        Map<String, List<Employee>> groupByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupByDept.entrySet().forEach(System.out::println);

        System.out.println();
        // partitionBy
        System.out.println("partitionBy");
        Map<Boolean, List<Employee>> partitionBySalary = empList.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary() > 7000));
        partitionBySalary.entrySet().forEach(System.out::println);

        // teeing is added in JDK 12 not available in JDK 8

        System.out.println();
        // summarizingInt
        System.out.println("summarizingInt");
        IntSummaryStatistics salaryStatistics = empList.stream().collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println("max: " + salaryStatistics.getMax() + ", min: " + salaryStatistics.getMin()
                + ", average: " + salaryStatistics.getAverage() + ", sum: " + salaryStatistics.getSum()
                + ", count: " + salaryStatistics.getCount());
    }
}
