package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 30 Convert a list of strings to uppercase. || Most Asked
 * I/P : List<String> list = Arrays.asList("breaking bad","game of thrones","big bang theory");
 * O/P : [BREAKING BAD, GAME OF THRONES, BIG BANG THEORY]
 */
public class Q30 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("breaking bad", "game of thrones", "big bang theory");
        System.out.println(list.stream().map(String::toUpperCase).toList());
    }
}
