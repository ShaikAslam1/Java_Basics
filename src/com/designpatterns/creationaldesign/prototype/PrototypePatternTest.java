package com.designpatterns.creationaldesign.prototype;

import java.util.List;

public class PrototypePatternTest {
    /*
    Prototype design pattern is used when the Object creation is a costly affair and
    requires a lot of time and resources, and you have a similar object already existing.
    Prototype pattern provides a mechanism to copy the original object to a new object
    and then modify it according to our needs. Prototype design pattern uses java cloning
    to copy the object.
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp = new Employees();
        emp.loadData();

        // use clone method to get employees object
        Employees empNew1 = (Employees) emp.clone();
        Employees empNew2 = (Employees) emp.clone();

        List<String> list1 = empNew1.getEmpList();
        list1.add("John");
        List<String> list2 = empNew2.getEmpList();
        list2.remove("Pankaj");

        System.out.println("emp List: " + emp.getEmpList());
        System.out.println("empNew1 List: " + list1);
        System.out.println("empNew2 List: " + list2);
    }
}
