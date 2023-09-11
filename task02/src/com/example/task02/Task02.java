package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long data = Long.parseLong(input);
        if (data >= -128 && data <= 127) {
            return "byte";
        }
        if (data >= -32768 && data <= 32767) {
            return "short";
        }
        if (data >= -2147483648 && data <= 2147483647) {
            return "int";
        }
        if (data >= -9223372036854775808L && data <= 9223372036854775807L) {
            return "long";
        }
        return null;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }
}
