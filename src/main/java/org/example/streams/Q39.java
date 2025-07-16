package org.example.streams;

import java.util.Arrays;

/**
 * 39 Multiply array elements(Conceptual) || Most Asked
 * I/P : Interger[] arr = {1,2,3,4,5};
 */
public class Q39 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(arr).boxed().reduce((a, b) -> a * b).get());
    }
}
