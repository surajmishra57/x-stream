package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 21 Given the string[] group the strings based on the middle character
 * I/P : String[] str = {"ewe","jji","jhj","kwk","aha"};
 * O/P : {w=[ewe,kwk],h=[jhj,aha],j=[jji]}
 */
public class Q21 {
    public static void main(String[] args) {
        String[] str = {"ewe", "jji", "jhj", "kwk", "aha"};
        Map<Object, List<String>> val = Arrays.stream(str).collect(Collectors.groupingBy(x -> x.charAt(x.length() / 2)));
        System.out.println(val);
    }
}
