package com.handsonjava8;

import java.util.*;

// Write your answer here, and then test your code.
// Your job is to implement the findAnswer() method.
public class Challenge1 {
    public static void main(String[] args) {
        // This is how your code will be called.
        // Your answer should be the largest value in the numbers array.
        // You can edit this code to try different testing cases.
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Algorithms", 90);
        map1.put("Data Structures", 80);
        map1.put("Calculus", 85);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Algorithms", 80);
        map2.put("Data Structures", 75);
        map2.put("Calculus", 88);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Algorithms", 92);
        map3.put("Data Structures", 89);
        map3.put("Calculus", 88);

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("Algorithms", 85);
        map4.put("Data Structures", 80);
        map4.put("Calculus", 89);

        List<Student> students = Arrays.asList(
                new Student("Amine", "Ousmane", "Computer Science", map1),
                new Student("Lily-Ann", "Smith", "Mathematics", map2),
                new Student("Li", "Wei", "Computer Science", map3),
                new Student("Jessica", "Rodriguez", "Mathematics", map4));
        String major = "Computer Science";
        int result = Answer.findAnswer(students, major);
        System.out.println(result);
    }
}

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the highest grade for the students with a specific major
    static int findAnswer(List<Student> students, String major) {
        // Your code goes here.
        return students.stream()
                .filter(student -> student.getMajor().equals(major))
                .flatMap(s -> s.getGrades().values().stream())
                .max(Integer::compareTo).orElse(0);
    }

}

class Student {
    private String firstname;
    private String lastname;
    private String major;
    private Map<String, Integer> grades;

    public Student(String firstname, String lastname, String major, Map<String, Integer> grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
        this.grades = grades;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMajor() {
        return major;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}
