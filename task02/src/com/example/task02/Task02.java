package com.example.task02;

public class Task02 {
    public static String solution(String input) {
        long a = Long.parseLong(input);

        if (a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) {
            return "byte";
        }
        else if (a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) {
            return "short";
        }
        else if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) {
            return "int";
        }
        return "long";
    }
    public static void main(String[] args) {
        String result = solution("50000000");
        System.out.println(result);
    }
}
