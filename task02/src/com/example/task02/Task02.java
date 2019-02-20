package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long temp = Math.abs(Long.parseLong(input)) - 1;

        if (temp > Integer.MAX_VALUE) return "long";
        if (temp > Short.MAX_VALUE) return "int";
        if (temp > Byte.MAX_VALUE) return "short";

        return "byte";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
