package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Remove all non-numeric characters from a list. || Most Asked
 * I/P : List<String> list = Arrays.asList("a1b2c3","1a2b3c","123abc");
 * O/P : [123,123,123]
 */
public class Q28 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1b2c3", "1a2b3c", "123abc");
        System.out.println(list.stream().map(x -> x.replaceAll("[^1-9]", ""))
                .toList());
    }
}
