package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long n = Long.parseLong(input);
        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) return "byte";
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) return "short";
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) return "int";
        return "long";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
