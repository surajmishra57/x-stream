package org.example.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Write a stream program to multiply alternative numbers in an array
 * I/P : int[] arr = {4,5,1,7,2,9,2};
 * O/P : 16
 */
public class Q17 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, 7, 2, 9, 2};
        OptionalInt result = IntStream.range(0, arr.length)
                .filter(x -> x % 2 == 0)
                .map(x -> arr[x])
                .reduce((a, b) -> a * b);
        System.out.println(result.getAsInt());
    }
}
