package org.example.streams;

import java.util.List;
import java.util.stream.IntStream;

/**
 * 18 Write a program to multiply 1st and last element, 2nd and 2nd last element etc.
 * I/P : int[] arr = {4,5,1,7,2,9};
 * O/P : [36,10,7]
 **/
public class Q18 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 7, 2, 9};
        List<Integer> res = IntStream.range(0, arr.length)
                .filter(x -> x < arr.length / 2)
                .map(x -> arr[x] * arr[arr.length - 1 - x])
                .boxed()
                .toList();
        System.out.println(res);
    }
}
