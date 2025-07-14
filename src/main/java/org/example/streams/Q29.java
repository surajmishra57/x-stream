package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 29 Find and print strings containing only digits
 * I/P : List<String> list = Arrays.asList("123","abc","123abc","45");
 * O/P : [123,45]
 */
public class Q29 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "abc", "123abc", "45");
        System.out.println(list.stream().filter(x -> x.replaceAll("[^1-9]", "").length() == x.length())
                .toList());
    }
}
