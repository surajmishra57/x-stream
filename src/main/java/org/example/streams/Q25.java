package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 25 Find and print the distinct odd numbers || Most Asked
 * I/P : List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,9,10);
 * O/P : [1,3,5,7,9]
 */
public class Q25 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10);
        System.out.println(list.stream().filter(x -> x % 2 != 0).distinct().toList());
    }
}
