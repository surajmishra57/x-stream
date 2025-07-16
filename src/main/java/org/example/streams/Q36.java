package org.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

/**
 * 36 Transform Person object stream into a single string |Most Asked
 * <p>
 * Transform Person Object Stream into a single String consisting of all names in
 * upper letters separated by '|' (pipe) character.
 * <p>
 * O/P : MAX | PETER | PAMELA | DAVID | DAN
 */
public class Q36 {
    public static void main(String[] args) {
        List<Person> persons =
                Arrays.asList(
                        new Person("Peter", 23),
                        new Person("Pamela", 24),
                        new Person("David", 28),
                        new Person("Dan", 30)
                );
        System.out.println(persons.stream().collect(Collector.of(
                () -> new StringJoiner(" | "),
                (j, p) -> j.add(p.getName()),
                StringJoiner::merge,
                StringJoiner::toString
        )));
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
