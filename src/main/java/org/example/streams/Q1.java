package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 01 Given a sentence, find the word that has the highest length || Most Asked
 * <p>
 * I/P : String s = "I am learning Streams API's in JAVA";
 * O/P : learning
 */
public class Q1 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String s = "I am learning Streams API's in JAVA";
        String result = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(result);
    }
}
