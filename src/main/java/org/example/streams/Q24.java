package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 24 Convert a list of integers to a list of their squares || Most Asked
 * I/P : List<Integer> list = Arrays.asList(1,2,3,4,5);
 * O/P : [1,4,9,16,25]
 */
public class Q24 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().map(x -> x * x).toList());

    }
}
