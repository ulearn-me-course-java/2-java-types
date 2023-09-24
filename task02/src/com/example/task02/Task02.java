package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (number >= -128 && number <= 127)
            return "byte";
        if (number >= -32768 && number <= 32767)
            return "short";
        if (number >= -2147483648 && number <= 2147483647)
            return "int";
        if (number >= -9_223_372_036_854_775_808L && number <= 9_223_372_036_854_775_807L)
            return "long";
        return "null";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
