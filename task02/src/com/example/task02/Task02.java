package com.example.task02;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Task02 {

    public static String solution(String input) {
        // ================== Я не ищу легких путей! ==================

        String type = Stream
                .of(Byte.class, Short.class, Integer.class, Long.class)
                .filter(makeComparator(input))
                .findFirst()
                .get()
                .getSimpleName()
                .toLowerCase();

        return type.equals("integer") ? "int" : type;
    }


    private static Predicate<Class<? extends Number>> makeComparator(String input) {
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
