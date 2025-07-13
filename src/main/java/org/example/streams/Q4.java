package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Find the 2nd highest length word in the given sentence
 * I/P : String s = "I am learning Streams API in Java"
 * O/P : 7
 */
public class Q4 {
    public static void main(String[] args) {
        String s = "I am learning Streams API in Java";

        int result = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .map(e -> e.length())
                .findFirst()
                .get();
        System.out.println(result);

        int res = Arrays.stream(s.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().get();
        System.out.println(res);
    }
}
