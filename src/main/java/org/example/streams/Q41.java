package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 41 Convert a list of string to uppercase and then concatenate || Most Asked
 * I/P : List<String> alphabets = Arrays.asList("a","b","c","d");
 * O/P : A B C D
 */
public class Q41 {
    public static void main(String[] args) {

        List<String> alphabets = Arrays.asList("a", "b", "c", "d");
        Optional<String> res = alphabets.stream().map(String::toUpperCase).reduce((a, b) -> a + "" + b);
        System.out.println(res.get());

        //Second Example

        var tp = alphabets.stream().map(String::toUpperCase).collect(Collector.of(
                () -> new StringJoiner(""),
                StringJoiner::add,
                StringJoiner::merge,
                StringJoiner::toString
        ));
        System.out.println(tp);
    }
}
