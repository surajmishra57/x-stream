package org.example.streams;

import java.util.Arrays;

/**
 * Remove duplicates from the string and return in the same order
 * I/P : String s = "dabcadefg";
 * O/P : dabcefg
 */
public class Q2 {
    public static void main(String[] args) {
        String s = "dabcadefg";

        s.chars().distinct().mapToObj(x -> (char) x).forEach(System.out::print);

        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
