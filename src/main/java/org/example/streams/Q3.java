package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Find the word that has the second-highest length|| Most Asked
 * <p>
 * Given a sentence, find the word that has the 2nd(Nth) the highest length
 * <p>
 * I/P : String s = "I am learning Streams API in Java"
 * O/P : Streams
 */
public class Q3 {
    public static void main(String[] args) {
        String s = "I am learning Stream API in Java";
        String result = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst().orElse("null");

        System.out.println(result);
    }
}
