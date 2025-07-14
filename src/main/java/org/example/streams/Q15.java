package org.example.streams;

import java.util.Arrays;
import java.util.Optional;

/**
 * Find the product of the first two elements from an array
 * I/P : int[] arr = {12,5,6,9,2,4}
 * O/P : 60
 */
public class Q15 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 6, 9, 2, 4};
        Optional<Integer> res = Arrays.stream(arr).boxed().limit(2).reduce((a, b) -> a * b);
        System.out.println(res.get());
    }
}
