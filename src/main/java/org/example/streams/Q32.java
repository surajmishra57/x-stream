package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * -32 Find the intersection of two lists using Java streams || Most Asked
 * I/P : List<Integer> list = Arrays.asList(1,2,3,4,5)
 * List<Integer> list = Arrays.asList(3,5,6,7)
 * <p>
 * O/P : [3,5]
 */
public class Q32 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 5, 6, 7);

        // First Way
        var result = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream().
                filter(x -> x.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(result);

        //Second Way
        System.out.println(list1.stream().filter(list2::contains).toList());
    }
}
