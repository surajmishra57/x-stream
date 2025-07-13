package org.example.streams;

import java.util.Arrays;

/**
 * Given a sentence, find the words with a specified number of vowels ||Most Asked
 * No of vowels:2
 * <p>
 * I/P : String s = "I am learning Streams API in Java"
 * <p>
 * O/P : Stream
 * API
 * Java
 */
public class Q6 {
    public static void main(String[] args) {
        String s = "I am learning Streams API in Java";
        Arrays.stream(s.split(" "))
                .filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
    }
}
