package org.example.streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a String, find the first repeated character
 * I/P : String s = "Hello World"
 * O/P : l
 */
public class Q12 {
    public static void main(String[] args) {
        String s = "Hello World";
        Character tp = s.chars().mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .findFirst()
                .get();
        System.out.println(tp);
    }

}
