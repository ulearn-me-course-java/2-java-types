package com.example.task14;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task14 {

    public static int reverse(int value) {
        String reversed = String
                .valueOf(value)
                .chars()
                .mapToObj(Task14::castToChar)
                .collect(reverseStream())
                .reduce(new StringBuilder(), StringBuilder::append, StringBuilder::append)
                .toString();

        return Integer.parseInt(reversed);
    }

    static <T> Collector<T, ?, Stream<T>> reverseStream() {
        return Collectors.collectingAndThen(Collectors.toList(), Task14::reverseCollection);
    }

    static <T> Stream<T> reverseCollection(List<T> list) {
        Collections.reverse(list);
        return list.stream();
    }

    static char castToChar(int i) {
        return (char) i;
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }
}