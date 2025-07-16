package org.example.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * 38 Convert a list to a map|| Most Asked
 * <p>
 * Convert a list to a map. Given a Person object list convert it to a map with a key as
 * 'City' and Value as List<Person>
 * <p>
 * List<Person> ---------------------> Map<String,List<Person>>
 */
public class Q38 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Amit", "Pune", 23);
        Person1 person2 = new Person1("Sumit", "Kolkata", 27);
        Person1 person3 = new Person1("Jatin", "Pune", 30);
        Person1 person4 = new Person1("Alex", "Pune", 22);
        Person1 person5 = new Person1("Payel", "Bangalore", 20);
        ArrayList<Person1> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person1);

        System.out.println(list.stream().collect(Collectors.groupingBy(Person1::getCity, Collectors.toList())));
    }
}

class Person1 {
    String name;
    String city;
    int age;

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person1(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
}