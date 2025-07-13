package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrange the numbers in Descending/Ascending Order|| Most Asked
 * Given an int[] array, re-arrange the elements to form the highest/lowest possible value
 * <p>
 * I/P : int[] arr = {1,2,3,4,5};
 * O/P : 54321/12345
 */
public class Q9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Arrays.stream(arr).boxed().sorted().forEach(System.out::print);
        System.out.println();
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
