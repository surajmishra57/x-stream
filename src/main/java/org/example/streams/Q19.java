package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 19 Write a stream program to move all zero’s to beginning of array ||Most Asked
 * I/P : int[] arr = {5,0,1,0,8,0}
 * O/P : {0,0,0,5,1,8}
 */
public class Q19 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 0, 1, 0, 8, 0};
        // First Method
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        List<Integer> nonZeroList = list.stream().filter(x -> x != 0).toList();
        List<Integer> zeroList = list.stream().filter(x -> x == 0).toList();
        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(zeroList);
        finalList.addAll(nonZeroList);
        System.out.println(finalList);

        // Second Method

        var result = list.stream()
                .collect(Collectors.groupingBy(x -> x != 0, Collectors.toList()))
                .values()
                .stream()
                .flatMap(Collection::stream).toList();
        System.out.println(result);

    }
}
