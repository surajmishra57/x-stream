package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 31 Calculate the average of all the numbers.
 * I/P : List<Integer> list = Arrays.asList(1,2,3,4,5);
 * O/P : 3.0
 */
public class Q31 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }
}
