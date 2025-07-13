package org.example.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a sentence, find the occurrence of each word
 * I/P : String s = "I am learning Streams API in Java Java"
 * <p>
 * O/P : {Java =2, in =1, I=1,API=1,learning=1,am=1,Streams=1}
 */
public class Q5 {
    public static void main(String[] args) {
        String s = "I am learning Streams API in Java Java";
        Map<String, Long> maps = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(maps);

        Map<String, Long> tp = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(tp);

//        Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(e -> System.out.println(e.getKey()));
    }
}
