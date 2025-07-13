package org.example.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array, find the sum of unique elements
 * I/P : int[] arr = {1,6,7,8,1,1,8,8,7}
 * O/P : 22
 */
public class Q10 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 7, 8, 1, 1, 8, 8, 7};

        System.out.println(Arrays.stream(arr).distinct().sum());

        Optional<Integer> temp = Arrays.stream(arr).boxed().distinct().reduce(Integer::sum);
        System.out.println(temp.get());


        var tt =  Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .keySet().stream().reduce(Integer::sum);
        System.out.println(tt.get());
    }
}
