package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            long l = Long.parseLong(input);
            if (l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE) {
                return "byte";
            } else if (l <= Short.MAX_VALUE && l >= Short.MIN_VALUE) {
                return "short";
            } else if (l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE) {
                return "int";
            }
            return "long";
        } catch (NumberFormatException e) {
            return "error";
        }
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
