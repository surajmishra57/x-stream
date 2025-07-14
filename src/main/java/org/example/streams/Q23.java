package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 23 Sort a list of strings in alphabetical order || Most Asked
 * I/P : List<String> str = Arrays.asList("Zudio","Puma","Addidas","MAC","H&M");
 * O/P : [Addidas,H&M,MAC,Puma,Zudio]
 */
public class Q23 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Zudio","Puma","Addidas","MAC","H&M");
        System.out.println(str.stream().sorted().toList());
    }
}
