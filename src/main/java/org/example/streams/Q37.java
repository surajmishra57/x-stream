package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of string, groups them by their first character and count the number of
 * strings in each group
 *
 * I/P :  List<String> strings = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry", "avocado");
 * O/P :  {a=3, b=2, c=1}
 *
 */
public class Q37 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry", "avocado");
        System.out.println(strings.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting())));
    }
}