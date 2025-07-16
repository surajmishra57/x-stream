package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 33 Find the occurrence of domains using Java streams || Most Asked
 * There is a list of Employee objects having field name and email. Find the list
 * of domains (gmail.com,yahoo.com etc.)
 * And the occurrences of each domain
 */
public class Q33 {
    public static void main(String[] args) {
        Employee e1 = new Employee("sam", "sam@gmail.com");
        Employee e2 = new Employee("Adam", "adam@yahoo.com");
        Employee e3 = new Employee("Peter", "peter@gmail.com");
        List<Employee> emp = Arrays.asList(e1, e2, e3);
        var info = emp.stream().collect(Collectors.groupingBy(x->x.getEmail().split("@")[1],
                Collectors.counting()));
        System.out.println(info);
    }
}


class Employee {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}