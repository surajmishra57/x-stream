package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Calculate average of age of male and female of employees |Most Asked Interview
 *
 */
public class Q50 {

    public static void main(String[] args) {
        Emp e1 = new Emp("Anil", "anil@gamil.com", 24, "M");
        Emp e2 = new Emp("Bob", "bob@gamil.com", 35, "M");
        Emp e3 = new Emp("Cindy", "cindy@gamil.com", 33, "F");
        Emp e4 = new Emp("Diana", "diana@gamil.com", 45, "F");
        Emp e5 = new Emp("tom", "tom@gamil.com", 55, "M");
        List<Emp> emps = Arrays.asList(e1, e2, e3, e4, e5);
        var res = emps.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingInt(Emp::getAge)));
        System.out.println(res);

    }

}

class Emp {
    private String name;
    private String email;
    private int age;
    private String gender;

    public Emp(String name, String email, int age, String gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
