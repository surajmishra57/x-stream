package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * -35 Convert list of integers to a list of their squares(Theory)|| Most Asked
 * I/P : List<Integer> list = Arrays.asList(1,2,3,4,5);
 * O/P : [1,4,9,16,25];
 */
public class Q35 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().map(x -> x * x).toList());
    }
}
