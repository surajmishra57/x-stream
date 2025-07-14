package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 20 In a given array of integers, return true if it contains distinct values
 * I/P : int[] arr = {5,0,1,0,8,0};
 * O/P : false
 */
public class Q20 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 0, 1, 0, 8, 0};
        List<Integer> input = Arrays.stream(arr).boxed().toList();
        List<Integer> output = input.stream().distinct().toList();
        System.out.println(input.size() == output.size());

        // Second Method

        var re = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().noneMatch(x->x>1);
        System.out.println(re);
    }
}
