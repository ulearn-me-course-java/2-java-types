package com.example.task02;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Task02 {
    public static String solution(String input) {
        long number;
        try {
            number = Long.parseLong(input);
        } catch (Exception e) {
            throw new NotImplementedException();
        }

        if (Byte.MIN_VALUE <= number && number <= Byte.MAX_VALUE) {
            return "byte";
        } else if (Short.MIN_VALUE <= number && number <= Short.MAX_VALUE) {
            return "short";
        } else if (Integer.MIN_VALUE <= number && number <= Integer.MAX_VALUE) {
            return "int";
        } else {
            return "long";
        }
    }
}
