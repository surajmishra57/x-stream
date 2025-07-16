package org.example.streams;

import java.util.List;
import java.util.stream.Stream;

/**
 * 34 Generate the first 10 numbers of the Fibonacci Sequence || Most Asked
 * O/P : 0,1,1,2,3,5,8,13,21,34
 */
public class Q34 {
    public static void main(String[] args) {
        List<Integer> fibonacci = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10).map(f -> f[0]).toList();

        System.out.println(fibonacci);
    }
}
