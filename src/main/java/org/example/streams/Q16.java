package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 16 Group /Pair anagrams from a list of Strings. || Most Asked
 * I/P : String s = {"pat","tap","pan","nap","Team","tree","meat"};
 * O/P : [[pan,nap],[pat,tap],[Team,meat],[tree]]
 */
public class Q16 {
    public static void main(String[] args) {
        String[] s = new String[]{"pat", "tap", "pan", "nap", "Team", "tree", "meat"};
        List<String> list = Arrays.asList(s);
        var result = list.stream().collect(
                Collectors.groupingBy(
                        x -> Arrays.stream(x.toLowerCase().split(""))
                                .sorted()
                                .collect(Collectors.toList()))).values();
        System.out.println(result);
    }
}
