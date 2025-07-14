package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, create a list that contains only integers
 * I/P : String[] s = {"abc","123","456","xyz"};
 * O/P : [123,456]
 */
public class Q14 {
    public static void main(String[] args) {
        String[] s = {"abc", "123", "456", "xyz"};
        var tp = Arrays.stream(s).filter(e -> e.replaceAll("[^0-9]", "").length() > 0)
                .toList();
        System.out.println(tp);

        List<Integer> ans = Arrays.stream(s).filter(x -> x.matches("[0-9]+")).map(Integer::valueOf)
                .toList();
        System.out.println(ans);
    }
}
