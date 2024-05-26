package com.epamtest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WiproArchive {
    public static void main(String[] args) {
        Set<Emp> temp = new TreeSet<>();
        // throw error because Emp is not comparable
//        temp.add(new Emp(1, "aslam", "it"));
//        temp.add(new Emp(1, "areef", "his"));
//        temp.add(new Emp(1, "javeriya", "sci"));
//
//        temp.forEach(System.out::println);

        Map<String, String> map = new HashMap<>();
        map.put(null, "aslam");
        map.put(null, "areef");
        map.put("IT", "afrose");

        map.entrySet().forEach(System.out::println);

        List<Emp> listOfEmp = new LinkedList<>();
        listOfEmp.add(new Emp(1, "aslam", "it"));
        listOfEmp.add(new Emp(2, "areef", "his"));
        listOfEmp.add(new Emp(3, "javeriya", "sci"));
        listOfEmp.add(new Emp(4, "john", "sci"));

        Map<String, Long> groupByDepCountEmp = listOfEmp.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.counting()));
        groupByDepCountEmp.forEach((key1, value) -> System.out.println(key1 + " " + value));

        System.out.println("Skip");
        listOfEmp.stream().skip(2).forEach(System.out::println);

        System.out.println("Limit");
        Stream.generate(Math::random).map(n -> (int) (n*100))
                .limit(10).forEach(System.out::println);


        /*
         List<Employee> =
         id,
         name,
         department

         employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

         int[] arr = {1,34,4,6,74,3,4,1}; = length = 8
         write a simple program to multiple of last but 3 elements from int array and give me the output

         4, 5 ,6,
         count = 0;
         sum = 0;
         for (int i=arr.length-2; count<3; i--) {
         sum += arr[i];
         count++;
         }

         System.out.println(sum);

         String s1 = new String("test"); -- this will create one object -- heap
         String s2 = "test"; -- this is another one -- string constant pool

         nth highest salary:

         SELECT Distinct salary FROM Employees Limit 1 OFFSET n-1;

         --
         service A -> making 2000 requests to service B,
         But Service B handles only 1000 requests in this case
         how to make service B to handle 2000 requests

         if interfaceA nad B have same default method
         and a class implements interfaceA and B
         ANS:- interfaceA.super().method();

         how circuit breaker work? if B is down

         actuators are really we use in prod or any other alternative we will use
         ANS:- spring boot admin server

         how to create separate properties file for dev, test, staging and prod
         and how to access them for each respective environment
         ANS:- spring.profiles.active=dev
         You can do this in your application.properties file, in your environment variables, or on the command line.

         how to connect to db without using application.properties file in spring
         ANS:- You can also configure a database connection using Java bean configuration.
         This is more flexible than using the application.properties file, but it is also more verbose.
         Using JNDI configuration.

         <jee:jndi-lookup id="dataSource" jndi-name="jdbc/mydb" />

         Or

         using Java Bean Configuration:
         @Configuration
         public class DataSourceConfig {

            @Bean
            public DataSource dataSource() {
                return DataSourceBuilder.create()
                    .url("jdbc:mysql://localhost:3306/mydb")
                    .username("myuser")
                    .password("mypassword")
                    .build();
            }
        }

        is it possible to inject a same bean using setter injection, constructor injection and field injection?

         */
    }
}
