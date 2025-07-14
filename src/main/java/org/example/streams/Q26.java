package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 26 Find the union of two lists of integers || Most asked
 * I/P : List<Integer> list1 = Arrays.asList(1,2,3,4,5);
 * List<Integer> list2 = Arrays.asList(6,7,8,9,10);
 * <p>
 * O/P ; [1,2,3,4,5,6,7,8,9,10]
 */
public class Q26 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println(Stream.concat(list1.stream(), list2.stream()).toList());
    }
}
