package org.example.streams;

import java.util.stream.Stream;

/**
 * 42 Concatenate 2 streams || Most Asked
 * I/P : Stream<String> stream1 = Stream.of("java","Python");
 * Stream<String> stream2 = Stream.of("C++","C#");
 * <p>
 * O/P : Java
 * Python
 * C++
 * C#
 */
public class Q42 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("java", "python");
        Stream<String> stream2 = Stream.of("c", "c++");

        Stream.concat(stream1,stream2).forEach(System.out::println);
    }
}
