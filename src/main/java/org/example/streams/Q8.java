package org.example.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a word, find the occurrence of each character ||Most Asked
 * I/P : String s = "Mississippi";
 * O/P : {p=2,s=4,i=4,m=1}
 */
public class Q8 {
    public static void main(String[] args) {
        String s = "Mississippi";
        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        Map<Character, Long> tp = s.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(tp);
    }
}
