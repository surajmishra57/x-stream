package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 27 Find the kth smallest element in a list of integers.
 * I/P : List<Integer> list1 = Arrays.asList(7,1,6,2,1,3,4,5);
 * k=3
 * 0/P : [2]
 */
public class Q27 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(7, 1, 6, 2, 1, 3, 4, 5);
        int k = 3;
        System.out.println(list1.stream().sorted().skip(k - 1).findFirst().orElse(-1));
    }
}
