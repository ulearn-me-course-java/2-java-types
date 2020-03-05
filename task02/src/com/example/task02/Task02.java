package com.example.task02;

import java.util.function.Predicate;
import java.util.stream.Stream;

class Int {
    public static final int MIN_VALUE = Integer.MIN_VALUE;
    public static final int MAX_VALUE = Integer.MAX_VALUE;
}

public class Task02 {

    public static String solution(String input) {
        // ================== Я не ищу легких путей! ==================

        return Stream
                .of(Byte.class, Short.class, Int.class, Long.class)
                .filter(makeComparator(input))
                .findFirst()
                .get()
                .getSimpleName()
                .toLowerCase();
    }

    private static Predicate<Class<?>> makeComparator(String input) throws RuntimeException {
        long number = Long.parseLong(input);

        return primitive -> {
            try {
                return number >= primitive.getField("MIN_VALUE").getLong(null) &&
                       number <= primitive.getField("MAX_VALUE").getLong(null);
            } catch (Exception e) {
                return false;
            }
        };
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}