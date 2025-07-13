package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Divide given integer list into lists of even and odd numbers
 * Given a list of integers, divide it into two list one having an even number and the other having an
 * odd number.
 * <p>
 * I/P : int[] arr = {1,2,3,4,5,6,7,8};
 * O/P : [[1,3,5,7],[2,4,6,8]]
 */
public class Q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        List<List<Integer>> res = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .values().stream().toList();
        System.out.println(res);

        //2nd approach
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(i -> i % 2 == 1)));

        List<List<Integer>> evenOddList = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .values().stream().toList();
        System.out.println(evenOddList);
    }
}
