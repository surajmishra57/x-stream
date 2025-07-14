package org.example.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a string, find the first non-repeated character || Most Asked
 * I/P : String s = "Hello World";
 * O/P : H
 */
public class Q11 {
    public static void main(String[] args) {
        String s = "Hello World";
        var to = Arrays.stream(s.split("")).filter(x -> s.indexOf(x) == s.lastIndexOf(x)).findFirst().get();
        System.out.println(to);

        Character tp = s.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .get();
        System.out.println(tp);
    }
}
