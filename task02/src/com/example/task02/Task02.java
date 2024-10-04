package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputvalue = Long.parseLong(input);

        if (inputvalue >= Byte.MIN_VALUE && inputvalue <= Byte.MAX_VALUE) {
            return "byte";
        } else if (inputvalue >= Short.MIN_VALUE && inputvalue <= Short.MAX_VALUE) {
            return "short";
        } else if (inputvalue >= Integer.MIN_VALUE && inputvalue <= Integer.MAX_VALUE) {
            return "int";
        } else if (inputvalue >= Long.MIN_VALUE && inputvalue <= Long.MAX_VALUE) {
            return "long";
        } else {
            return "invalid number";
        }
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }


}