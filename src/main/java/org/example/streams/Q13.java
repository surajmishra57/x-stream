package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of integers, group the numbers by the range || Most Asked
 * Given an array of integers, group the numbers by the range in which they belong
 * <p>
 * I/P : int[] arr = {2,3,10,14,20,24,30,34,40,44,50,54}
 * o/P : {0=[2,3], 10=[10,14],20=[20,24],30=[30.34],40=[40,44],50=[50,54]}
 */
public class Q13 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54};
        Map<Integer, List<Integer>> res = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(
                x -> (x / 10) * 10,
                Collectors.toList()
        ));
        var r = res.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).toList();
        System.out.println(r);

    }
}
