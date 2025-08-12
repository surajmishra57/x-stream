package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * - 40 Can we reuse stream in Java 8 ? || Most Asked
 */
public class Q40 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");

        Supplier<Stream<String>> nameStream = () -> names.stream();
        //Consumption 1
        nameStream.get().forEach(System.out::println);
        //Consumption example 2
        long listSize = nameStream.get().count();
        System.out.println();
        System.out.println(listSize);
    }
}
