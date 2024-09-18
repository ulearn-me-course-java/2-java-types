package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        Long num = Long.parseLong(input);
        if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE) {
            return "byte";
        } else if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE) {
            return "short";
        } else if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE) {
            return "int";
        } else if (num <= Long.MAX_VALUE && num >= Long.MIN_VALUE) {
            return "long";
        }

        return "";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
