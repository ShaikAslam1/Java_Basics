package com.epamtest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInterview {

    public static void main(String[] args) {
        // merge two arrays
        List<Emp> listOfEmp = new LinkedList<>();
        listOfEmp.add(new Emp(1, "aslam", "it"));
        listOfEmp.add(new Emp(2, "areef", "his"));
        listOfEmp.add(new Emp(3, "javeriya", "sci"));
        listOfEmp.add(new Emp(4, "john", "sci"));

        List<Emp> listOfEmp2 = new LinkedList<>();
        listOfEmp2.add(new Emp(1, "khalid", "it"));
        listOfEmp2.add(new Emp(2, "uzair", "his"));
        listOfEmp2.add(new Emp(3, "aisha", "sci"));
        listOfEmp2.add(new Emp(4, "khadija", "sci"));

        List<Emp> mergedAndSorted = Stream.concat(listOfEmp.stream(), listOfEmp2.stream())
                .sorted(Comparator.comparing(Emp::getDepartment))
                .collect(Collectors.toList());

        mergedAndSorted.forEach(System.out::println);

        // find count of employees in each department
        Map<String, Long> countEmpInEachDepartment = mergedAndSorted.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.counting()));
        System.out.println("Emp count in each department: " + countEmpInEachDepartment);

        Map<String, Double> averageSalaryOfEachDepartment = mergedAndSorted.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment,
                Collectors.averagingDouble(Emp::getId)));
        System.out.println("Average salary of each department: " + averageSalaryOfEachDepartment);

        System.out.println();
        // student

        List<Student> studentList = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));


        // Find the average age of male and female students
        Map<String, Double> averageAgeByGender = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age by gender: " + averageAgeByGender);

        // Find the department who is having maximum number of students
        Map.Entry<String, Long> maxStudentsByDepartment = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Maximum students by department: " + maxStudentsByDepartment);

        // Find the Students who stays in Delhi and sort them by their names
        List<Student> byCityAndSortByName = studentList.stream().filter(e -> e.getCity().equals("Delhi"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());
        System.out.println("students who stays in Delhi and sort them by names");
        byCityAndSortByName.forEach(System.out::println);

        // Find the highest rank in each department
        Map<String, Optional<Student>> highestRankInEachDepartment = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName,
                Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("Highest rank in each department: " + highestRankInEachDepartment);

        // Find the student who has second rank
        Student secondRankStudent = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1).findFirst().get();
        System.out.println("Second highest rank student: " + secondRankStudent);
    }
}
