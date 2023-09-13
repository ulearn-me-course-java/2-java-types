package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputAsNumber = Long.parseLong(input);
        if (inputAsNumber <= Byte.MAX_VALUE && inputAsNumber >= Byte.MIN_VALUE) {
            return "byte";
        } else if (inputAsNumber <= Short.MAX_VALUE && inputAsNumber >= Short.MIN_VALUE) {
            return "short";
        } else if (inputAsNumber <= Integer.MAX_VALUE && inputAsNumber >= Integer.MIN_VALUE) {
            return "int";
        }
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
