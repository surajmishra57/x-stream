package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * -22 Find the sum of all the elements in a list.
 * I/P : List<Integer> num  = Arrays.asList(1,2,3,4,5);
 * O/P : 15
 */
public class Q22 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        var result = num.stream().reduce(Integer::sum);
        System.out.println(result.get());

        var res = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println(res);
    }
}
